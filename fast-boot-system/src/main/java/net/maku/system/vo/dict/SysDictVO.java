package net.maku.system.vo.dict;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * 全部字典
 *
 * @author 阿沐 babamu@126.com
 */
@Data
@Schema(name = "全部字典")
public class SysDictVO {
    @Schema(name = "字典类型")
    private String dictType;

    @Schema(name = "字典数据列表")
    private List<DictData> dataList = new ArrayList<>();

    @Data
    @AllArgsConstructor
    @Schema(name = "字典数据")
    public static class DictData {
        @Schema(name = "字典标签")
        private String dictLabel;

        @Schema(name = "字典值")
        private String dictValue;
    }
}
