package com.example.Modeling_Complex_Relationships.AssociationOfNursesTests;

import com.example.Modeling_Complex_Relationships.exercises.AssociationOfNurses.Member;
import com.example.Modeling_Complex_Relationships.exercises.AssociationOfNurses.MemberStatus;
import com.example.Modeling_Complex_Relationships.exercises.AssociationOfNurses.Repositories.MemberRepository;
import com.example.Modeling_Complex_Relationships.exercises.AssociationOfNurses.Services.MemberService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.junit.jupiter.api.extension.ExtendWith;
import java.util.List;
import java.util.Arrays;

@ExtendWith(MockitoExtension.class)
public class MemberServiceTest {

    @Mock
    private MemberRepository memberRepository;

    @InjectMocks
    private MemberService memberService;

    @Test
    public void whenFindMembersByStatus_thenReturnMembersList() {
        // Setup our mock repository
        Member member1 = new Member();
        member1.setStatus(MemberStatus.ACTIVE);
        Member member2 = new Member();
        member2.setStatus(MemberStatus.ACTIVE);

        Mockito.when(memberRepository.findByStatus(MemberStatus.ACTIVE)).thenReturn(Arrays.asList(member1, member2));

        // Execute the service call
        List<Member> foundMembers = memberService.findMembersByStatus(MemberStatus.ACTIVE);

        // Assert the response
        Assertions.assertNotNull(foundMembers);
        Assertions.assertFalse(foundMembers.isEmpty());
        Assertions.assertEquals(2, foundMembers.size());
        Assertions.assertTrue(foundMembers.stream().allMatch(member -> member.getStatus() == MemberStatus.ACTIVE));

        // Verify interaction with mock repository
        Mockito.verify(memberRepository).findByStatus(MemberStatus.ACTIVE);
    }

    // Additional tests as necessary...
}
