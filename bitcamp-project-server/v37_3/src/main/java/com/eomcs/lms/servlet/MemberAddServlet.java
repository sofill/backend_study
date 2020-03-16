package com.eomcs.lms.servlet;

import java.io.PrintStream;
import java.util.Scanner;
import com.eomcs.lms.dao.MemberDao;
import com.eomcs.lms.domain.Member;

public class MemberAddServlet implements Servlet {

  MemberDao memberDao;

  public MemberAddServlet(MemberDao memberDao) {
    this.memberDao = memberDao;
  }

  @Override
  public void service(Scanner in, PrintStream out) throws Exception {

    Member member = new Member();

    out.println("이름? ");
    out.println("!{}!");
    out.flush();
    member.setName(in.nextLine());

    if (memberDao.insert(member) > 0) {
      out.println("새 회원을 등록했습니다.");

    } else {
      out.println("회원 등록에 실패했습니다.");
    }
  }
}