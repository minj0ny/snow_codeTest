package net.skhu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import net.skhu.dto.Script;

@Mapper
public interface ScriptMapper {
	  List<Script> findAll(int scriptIdx);
}
