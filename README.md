# DesignPattern
디자인 패턴 구현해보는 repo

## 좋은 소프트웨어
변화에 잘 대응할 수 있는 소프트웨어(좋은 설계로 만들어진 소프트웨어)
## 좋은 설계
새로운 요구사항 및 변경사항이 있을 때 영향을 받는 범위가 적은 구조


## 7/16
싱글톤 패턴 사용 시 상태를 유지할 떄의 문제점

LazyHolder 패턴에서의 장점
- 정적 멤버 클래스를 사용해 메모리 누수 방지 가능
- 가장 확실한 Thread-safe 보장
    <br>

### 싱글톤 패턴의 일반적 문제
- 역직렬화
- 리플렉션

## 7/22
Composite
- composite 패턴 예시: 파일 디렉토리
- INPA 예제 따라 구현한 후 더 발전시켜보기.

## 7/30
Observer 패턴 예시 구현
1. 기본 legacy 코드
2. interface 를 직접 만들어 구현한 Observer Pattern
3. 내장 Observer 인터페이스, Observable 클래스를 사용한 Observer Pattern
4. 대안으로 사용될 수 있는 기술 찾아보고 적용해보기