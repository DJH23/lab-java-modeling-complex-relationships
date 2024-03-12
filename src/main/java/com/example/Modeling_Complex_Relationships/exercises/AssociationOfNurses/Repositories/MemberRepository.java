package com.example.Modeling_Complex_Relationships.exercises.AssociationOfNurses.Repositories;

import com.example.Modeling_Complex_Relationships.exercises.AssociationOfNurses.MemberStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.Modeling_Complex_Relationships.exercises.AssociationOfNurses.Member;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member, Long> {
    List<Member> findByStatus(MemberStatus status);
}
