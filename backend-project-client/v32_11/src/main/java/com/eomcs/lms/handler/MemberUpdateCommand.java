package com.eomcs.lms.handler;

import com.eomcs.lms.dao.proxy.MemberDaoProxy;
import com.eomcs.lms.domain.Member;
import com.eomcs.util.Prompt;

//"/member/update" 명령 처리
public class MemberUpdateCommand implements Command {

  Prompt prompt;
  MemberDaoProxy memberDao;

  public MemberUpdateCommand(MemberDaoProxy memberDao, Prompt prompt) {
    this.memberDao = memberDao;
    this.prompt = prompt;
  }

  @Override
  public void execute() {
    try {
      int no = prompt.inputInt("번호? ");


      Member oldMember = null;
      try {
        oldMember = memberDao.findByNo(no);
      } catch (Exception e) {
        System.out.println("해당 번호의 게시글이 없습니다.");
        return;
      }

      Member newMember = new Member();

      newMember.setNo(oldMember.getNo());
      newMember.setRegisteredDate(oldMember.getRegisteredDate());

      newMember.setName(prompt.inputString(String.format("이름(%s)? ",
          oldMember.getName()), oldMember.getName()));

      newMember.setEmail(prompt.inputString(String.format("이메일(%s)? ",
          oldMember.getEmail()), oldMember.getEmail()));

      newMember.setPassword(prompt.inputString(String.format("암호(%s)? ",
          oldMember.getPassword()), oldMember.getPassword()));

      newMember.setPhoto(prompt.inputString(String.format("사진(%s)? ",
          oldMember.getPhoto()), oldMember.getPhoto()));

      newMember.setTel(prompt.inputString(String.format("전화(%s)? ",
          oldMember.getTel()), oldMember.getTel()));

      if (oldMember.equals(newMember)) {
        System.out.println("회원 변경을 취소하였습니다.");
        return;
      }

      memberDao.update(newMember);
      System.out.println("회원을 변경하였습니다.");

    } catch (Exception e) {
      System.out.println("변경 실패!");
    }
  }
}
