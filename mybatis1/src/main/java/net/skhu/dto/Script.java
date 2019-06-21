package net.skhu.dto;

public class Script {
	int scriptIdx;
	String content;
	String value;
	int fork;

	public int getFork() {
		return fork;
	}

	public void setFork(int fork) {
		this.fork = fork;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public int getScriptIdx() {
		return scriptIdx;
	}

	public void setScriptIdx(int scriptIdx) {
		this.scriptIdx = scriptIdx;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
