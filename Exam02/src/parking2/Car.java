package parking2;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
//차 넣다 뺐다 하기

@ToString
@Setter
@Getter
@AllArgsConstructor // public car 하자는 소리 즉 생성자를 만드는 역할을 수행한다  
public class Car {
	private String carNo;
	private String model;
}
