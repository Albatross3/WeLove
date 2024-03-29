package com.random.ChatRoom.core.member.service;

import com.random.ChatRoom.core.member.domain.Member;
import com.random.ChatRoom.core.member.domain.MemberRepository;
import com.random.ChatRoom.core.member.dto.MemberRegisterRequest;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor(access = AccessLevel.PUBLIC)
public class MemberService {

  private final MemberRepository memberRepository;

  @Transactional
  public Long saveMember(MemberRegisterRequest memberRegisterRequest) {
    Member member = memberRegisterRequest.toMember();
    Member savedMember = memberRepository.save(member);
    return savedMember.getMemberId();
  }

}
