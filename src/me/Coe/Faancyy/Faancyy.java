package me.Coe.Faancyy;

import org.json.simple.JSONObject;

public interface Faancyy{
	default FancyMessage FancyMessage(Object... Arguments){
		return new FancyMessage(Arguments);
	}
	default Object Open(String URL){
		JSONObject Object = new JSONObject();
		Object.put("action", "open_url");
		Object.put("value", URL);
		return new Object[]{"clickEvent", Object};
	}
	default Object Run(String Command){
		JSONObject Object = new JSONObject();
		Object.put("action", "run_command");
		Object.put("value", Command);
		return new Object[]{"clickEvent", Object};
	}
	default Object Suggest(String Command){
		JSONObject Object = new JSONObject();
		Object.put("action", "suggest_command");
		Object.put("value", Command);
		return new Object[]{"clickEvent", Object};
	}
	default Object Show(String Text){
		JSONObject Object = new JSONObject();
		Object.put("action", "show_text");
		Object.put("value", Text);
		return new Object[]{"hoverEvent", Object};
	}
}