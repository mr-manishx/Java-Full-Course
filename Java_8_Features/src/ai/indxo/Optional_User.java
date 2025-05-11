package ai.indxo;

import java.util.Optional;

public class Optional_User {
	
	public String getUserNameById(Integer id) {
		if(id == 100) {
			return "Raju";
		}
		else if(id == 101) {
			return "Rithika";
		}
		else {
			return null;
		}
	}
	
	public Optional<String> getUserNameByIdOptiona(Integer id){
		
		String name = null;
		if(id == 100) {
			name = "Sofia";
		}
		else if(id == 101) {
			name = "Meera";
		}
		
		return Optional.ofNullable(name);
	}

}
