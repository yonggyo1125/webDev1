package main;

import config.AppCtx;
import models.member.Member;
import models.member.MemberDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Ex02 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);
        MemberDao memberDao = ctx.getBean(MemberDao.class);

        List<Member> members = memberDao.getList();
        members.stream().forEach(System.out::println);
        ctx.close();
    }
}
