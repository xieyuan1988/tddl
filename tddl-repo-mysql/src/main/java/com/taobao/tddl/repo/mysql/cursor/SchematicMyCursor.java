package com.taobao.tddl.repo.mysql.cursor;

import java.util.List;

import com.taobao.tddl.executor.common.ICursorMeta;
import com.taobao.tddl.executor.cursor.Cursor;
import com.taobao.tddl.executor.cursor.SchematicCursor;
import com.taobao.tddl.optimizer.core.expression.IOrderBy;
import com.taobao.tddl.repo.mysql.CursorMyUtils;
import com.taobao.tddl.repo.mysql.spi.My_Condensable;

/**
 * @author mengshi.sunmengshi 2013-12-5 下午6:18:24
 * @since 5.1.0
 */
public class SchematicMyCursor extends SchematicCursor implements My_Condensable {

    public SchematicMyCursor(Cursor cursor, ICursorMeta meta){
        super(cursor);
    }

    public SchematicMyCursor(Cursor cursor, ICursorMeta meta, List<IOrderBy> orderBys){
        super(cursor, meta, orderBys);
    }

    @Override
    public String getGroupNodeName() {
        return CursorMyUtils.getGroupNodeName(cursor);
    }

}
