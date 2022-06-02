package j18_최상위클래스.entity;

import java.time.LocalDate;
import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//컨+쉬+s 와 동일한 효과
//자동생성과 동일한 효과

//@NoArgsConstructor //args = 매개변수
@RequiredArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString

public class Product2 {
		@NonNull //@RequiredArgsConstructor 짝 , 변수값이 null일수 없다. -> final , 밑에 변수만 효과를 받음 변수전체가 아니라.
		private final int productCode; //final이 붙으면서 Noarg~ 는 사용불가. 생성시 값을 입력해야해서. no가아님
		private String productName;
		private int category;
		private LocalDate productionDate;
		
				
}

