package j19_제네릭;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data // = get + set + eq + hash + tost
public class CMRespDto<T> {
	private int code;
	private String msg;
	private T data; //자료형의 변동이 필요한 경우 - 제네릭사용<T>.

}
