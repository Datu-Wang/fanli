package com.datu.fanli.manage.dao;

import com.datu.fanli.bean.SkuInfo;
import com.datu.fanli.bean.SkuInfoExample.Criteria;
import com.datu.fanli.bean.SkuInfoExample.Criterion;
import com.datu.fanli.bean.SkuInfoExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class SkuInfoSqlProvider {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_sku_info
     *
     * @mbg.generated
     */
    public String countByExample(SkuInfoExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("pms_sku_info");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_sku_info
     *
     * @mbg.generated
     */
    public String deleteByExample(SkuInfoExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("pms_sku_info");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_sku_info
     *
     * @mbg.generated
     */
    public String insertSelective(SkuInfo record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("pms_sku_info");
        
        if (record.getProductId() != null) {
            sql.VALUES("product_id", "#{productId,jdbcType=BIGINT}");
        }
        
        if (record.getPrice() != null) {
            sql.VALUES("price", "#{price,jdbcType=DOUBLE}");
        }
        
        if (record.getSkuName() != null) {
            sql.VALUES("sku_name", "#{skuName,jdbcType=VARCHAR}");
        }
        
        if (record.getSkuDesc() != null) {
            sql.VALUES("sku_desc", "#{skuDesc,jdbcType=VARCHAR}");
        }
        
        if (record.getWeight() != null) {
            sql.VALUES("weight", "#{weight,jdbcType=DOUBLE}");
        }
        
        if (record.getTmId() != null) {
            sql.VALUES("tm_id", "#{tmId,jdbcType=BIGINT}");
        }
        
        if (record.getCatalog3Id() != null) {
            sql.VALUES("catalog3_id", "#{catalog3Id,jdbcType=BIGINT}");
        }
        
        if (record.getSkuDefaultImg() != null) {
            sql.VALUES("sku_default_img", "#{skuDefaultImg,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_sku_info
     *
     * @mbg.generated
     */
    public String selectByExample(SkuInfoExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("product_id");
        sql.SELECT("price");
        sql.SELECT("sku_name");
        sql.SELECT("sku_desc");
        sql.SELECT("weight");
        sql.SELECT("tm_id");
        sql.SELECT("catalog3_id");
        sql.SELECT("sku_default_img");
        sql.FROM("pms_sku_info");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_sku_info
     *
     * @mbg.generated
     */
    public String updateByExampleSelective(Map<String, Object> parameter) {
        SkuInfo record = (SkuInfo) parameter.get("record");
        SkuInfoExample example = (SkuInfoExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("pms_sku_info");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=BIGINT}");
        }
        
        if (record.getProductId() != null) {
            sql.SET("product_id = #{record.productId,jdbcType=BIGINT}");
        }
        
        if (record.getPrice() != null) {
            sql.SET("price = #{record.price,jdbcType=DOUBLE}");
        }
        
        if (record.getSkuName() != null) {
            sql.SET("sku_name = #{record.skuName,jdbcType=VARCHAR}");
        }
        
        if (record.getSkuDesc() != null) {
            sql.SET("sku_desc = #{record.skuDesc,jdbcType=VARCHAR}");
        }
        
        if (record.getWeight() != null) {
            sql.SET("weight = #{record.weight,jdbcType=DOUBLE}");
        }
        
        if (record.getTmId() != null) {
            sql.SET("tm_id = #{record.tmId,jdbcType=BIGINT}");
        }
        
        if (record.getCatalog3Id() != null) {
            sql.SET("catalog3_id = #{record.catalog3Id,jdbcType=BIGINT}");
        }
        
        if (record.getSkuDefaultImg() != null) {
            sql.SET("sku_default_img = #{record.skuDefaultImg,jdbcType=VARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_sku_info
     *
     * @mbg.generated
     */
    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("pms_sku_info");
        
        sql.SET("id = #{record.id,jdbcType=BIGINT}");
        sql.SET("product_id = #{record.productId,jdbcType=BIGINT}");
        sql.SET("price = #{record.price,jdbcType=DOUBLE}");
        sql.SET("sku_name = #{record.skuName,jdbcType=VARCHAR}");
        sql.SET("sku_desc = #{record.skuDesc,jdbcType=VARCHAR}");
        sql.SET("weight = #{record.weight,jdbcType=DOUBLE}");
        sql.SET("tm_id = #{record.tmId,jdbcType=BIGINT}");
        sql.SET("catalog3_id = #{record.catalog3Id,jdbcType=BIGINT}");
        sql.SET("sku_default_img = #{record.skuDefaultImg,jdbcType=VARCHAR}");
        
        SkuInfoExample example = (SkuInfoExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_sku_info
     *
     * @mbg.generated
     */
    public String updateByPrimaryKeySelective(SkuInfo record) {
        SQL sql = new SQL();
        sql.UPDATE("pms_sku_info");
        
        if (record.getProductId() != null) {
            sql.SET("product_id = #{productId,jdbcType=BIGINT}");
        }
        
        if (record.getPrice() != null) {
            sql.SET("price = #{price,jdbcType=DOUBLE}");
        }
        
        if (record.getSkuName() != null) {
            sql.SET("sku_name = #{skuName,jdbcType=VARCHAR}");
        }
        
        if (record.getSkuDesc() != null) {
            sql.SET("sku_desc = #{skuDesc,jdbcType=VARCHAR}");
        }
        
        if (record.getWeight() != null) {
            sql.SET("weight = #{weight,jdbcType=DOUBLE}");
        }
        
        if (record.getTmId() != null) {
            sql.SET("tm_id = #{tmId,jdbcType=BIGINT}");
        }
        
        if (record.getCatalog3Id() != null) {
            sql.SET("catalog3_id = #{catalog3Id,jdbcType=BIGINT}");
        }
        
        if (record.getSkuDefaultImg() != null) {
            sql.SET("sku_default_img = #{skuDefaultImg,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("id = #{id,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_sku_info
     *
     * @mbg.generated
     */
    protected void applyWhere(SQL sql, SkuInfoExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            sql.WHERE(sb.toString());
        }
    }
}