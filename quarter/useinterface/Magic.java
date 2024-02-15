package quarter.useinterface;

/**
 * 인터페이스를 활용하여 switch 조건문 중복 해소하기
 * 예시: 마법 자료형을 인터페이스로 표현
 */
interface Magic {
  String name();
  int costMagicPoint(); //소비량
  //MagicPoint costMagicPoint(); <- 값을 객체화하기
  int attackPower(); //공격력
  int costTechnicalPoint(); //테크니컬 포인트
}
