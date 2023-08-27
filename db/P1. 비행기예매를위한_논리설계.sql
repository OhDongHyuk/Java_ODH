/*
비행기 예매 사이트 구축을 위한 요구사항

- 회원만 예매할 수 있다.
- 회원은 아이디, 비밀번호, 성함, 주민등록번호, 전화번호, 주소, 상세주소, 등급, 마일리지, 권한으로 이루어져 있다.
- 비행기를 예매하기 위해선 예매번호, 마일리지 사용액, 총 금액, 예매 좌석 수를 입력한다
- 회원 등급은 다이아몬드, 플레티넘, 에메랄드, 골드로 이루어져 있다.
- 좌석 등급은 퍼스트, 비지니스, 이코노미로 나뉘어진다.

- 관리자는 새로운 비행기와 비행기 스케쥴을을 등록한다.
- 항공사 등록시 소속 국가, 스케쥴, 항공기를 입력한다.
- 비행기 등록시 소속 항공사, 기체 번호, 전체 좌석 수를 입력한다.
- 좌석은 행은 영러 열은 숫자로 한다.
- 비행기 스케쥴 등록시 출발지, 도착지, 출발시간, 도착시간, 총 항공시간, 비행기, 항공사, 공항을 입력한다.
- 항공료는 나이에 상관없이 동일하다.

- 회원은 현재 예매한 항공 스케쥴을 확인할 수 있다.
- 회원은 과거 예매했던 항공 스케쥴을 확인할 수 있다.
- 회원은 마일리지 사용내용을 확인할 수 있다.
- 회원은 마일리지 적립내용을 확인할 수 있다.
- 마일리지는 항공료의 3%를 적립받는다.
 
- 공항 등록시 국가, 지역, 항공사, 항공기를 등록한다.
- 비행기는 출발시간 30분 전부터 탑승 가능하다.

*/
/*
비행기 예매를 위한 논리 설계
회원(아이디(PK), 비밀번호, 성함(영문명), 주민등록번호, 전화번호, 등급, 마일리지, 권한)
예매(예매번호(PK), 예매 좌석 수, 총 금액, 마일리지 사용액, 아이디(FK), 스케쥴(FK))
스케쥴(스케쥴번호(PK), 출발지, 도착지, 출발일, 도착일, 출발시간, 도착시간, 총 항공시간, 비행기(FK), 공항(FK))
비행기(비행기번호(PK), 전체좌석수, 항공사(FK))
좌석(좌석번호(PK), 좌석명, 행, 열, 좌석등급, 비행기번호(FK))
항공사(항공사번호(PK), 항공사명, 소속국가(FK))
국가(국가명(PK))
공항(공항번호(PK), 국가명, 공항리스트(FK))
*/