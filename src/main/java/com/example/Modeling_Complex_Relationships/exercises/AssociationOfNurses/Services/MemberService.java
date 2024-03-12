package com.example.Modeling_Complex_Relationships.exercises.AssociationOfNurses.Services;

import com.example.Modeling_Complex_Relationships.exercises.AssociationOfNurses.Member;
import com.example.Modeling_Complex_Relationships.exercises.AssociationOfNurses.MemberStatus;
import com.example.Modeling_Complex_Relationships.exercises.AssociationOfNurses.Repositories.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MemberService {
    private final MemberRepository memberRepository;

    @Autowired
    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public List<Member> findMembersByStatus(MemberStatus status) {
        return memberRepository.findByStatus(status);
    }

    // Additional methods as necessary...
}
