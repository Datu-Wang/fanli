package com.datu.fanli.manage.dao;

import com.datu.fanli.bean.SkuSaleAttrValue;
import com.datu.fanli.bean.SkuSaleAttrValueExample.Criteria;
import com.datu.fanli.bean.SkuSaleAttrValueExample.Criterion;
import com.datu.fanli.bean.SkuSaleAttrValueExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class SkuSaleAttrValueSqlProvider {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_sku_sale_attr_value
     *
     * @mbg.generated
     */
    public String countByExample(SkuSaleAttrValueExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("pms_sku_sale_attr_value");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_sku_sale_attr_value
     *
     * @mbg.generated
     */
    public String deleteByExample(SkuSaleAttrValueExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("pms_sku_sale_attr_value");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_sku_sale_attr_value
     *
     * @mbg.generated
     */
    public String insertSelective(SkuSaleAttrValue record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("pms_sku_sale_attr_value");
        
        if (record.getSkuId() != null) {
            sql.VALUES("sku_id", "#{skuId,jdbcType=BIGINT}");
        }
        
        if (record.getSaleAttrId() != null) {
            sql.VALUES("sale_attr_id", "#{saleAttrId,jdbcType=BIGINT}");
        }
        
        if (record.getSaleAttrValueId() != null) {
            sql.VALUES("sale_attr_value_id", "#{saleAttrValueId,jdbcType=BIGINT}");
        }
        
        if (record.getSaleAttrName() != null) {
            sql.VALUES("sale_attr_name", "#{saleAttrName,jdbcType=VARCHAR}");
        }
        
        if (record.getSaleAttrValueName() != null) {
            sql.VALUES("sale_attr_value_name", "#{saleAttrValueName,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_sku_sale_attr_value
     *
     * @mbg.generated
     */
    public String selectByExample(SkuSaleAttrValueExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("sku_id");
        sql.SELECT("sale_attr_id");
        sql.SELECT("sale_attr_value_id");
        sql.SELECT("sale_attr_name");
        sql.SELECT("sale_attr_value_name");
        sql.FROM("pms_sku_sale_attr_value");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_sku_sale_attr_value
     *
     * @mbg.generated
     */
    public String updateByExampleSelective(Map<String, Object> parameter) {
        SkuSaleAttrValue record = (SkuSaleAttrValue) parameter.get("record");
        SkuSaleAttrValueExample example = (SkuSaleAttrValueExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("pms_sku_sale_attr_value");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=BIGINT}");
        }
        
        if (record.getSkuId() != null) {
            sql.SET("sku_id = #{record.skuId,jdbcType=BIGINT}");
        }
        
        if (record.getSaleAttrId() != null) {
            sql.SET("sale_attr_id = #{record.saleAttrId,jdbcType=BIGINT}");
        }
        
        if (record.getSaleAttrValueId() != null) {
            sql.SET("sale_attr_value_id = #{record.saleAttrValueId,jdbcType=BIGINT}");
        }
        
        if (record.getSaleAttrName() != null) {
            sql.SET("sale_attr_name = #{record.saleAttrName,jdbcType=VARCHAR}");
        }
        
        if (record.getSaleAttrValueName() != null) {
            sql.SET("sale_attr_value_name = #{record.saleAttrValueName,jdbcType=VARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_sku_sale_attr_value
     *
     * @mbg.generated
     */
    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("pms_sku_sale_attr_value");
        
        sql.SET("id = #{record.id,jdbcType=BIGINT}");
        sql.SET("sku_id = #{record.skuId,jdbcType=BIGINT}");
        sql.SET("sale_attr_id = #{record.saleAttrId,jdbcType=BIGINT}");
        sql.SET("sale_attr_value_id = #{record.saleAttrValueId,jdbcType=BIGINT}");
        sql.SET("sale_attr_name = #{record.saleAttrName,jdbcType=VARCHAR}");
        sql.SET("sale_attr_value_name = #{record.saleAttrValueName,jdbcType=VARCHAR}");
        
        SkuSaleAttrValueExample example = (SkuSaleAttrValueExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_sku_sale_attr_value
     *
     * @mbg.generated
     */
    public String updateByPrimaryKeySelective(SkuSaleAttrValue record) {
        SQL sql = new SQL();
        sql.UPDATE("pms_sku_sale_attr_value");
        
        if (record.getSkuId() != null) {
            sql.SET("sku_id = #{skuId,jdbcType=BIGINT}");
        }
        
        if (record.getSaleAttrId() != null) {
            sql.SET("sale_attr_id = #{saleAttrId,jdbcType=BIGINT}");
        }
        
        if (record.getSaleAttrValueId() != null) {
            sql.SET("sale_attr_value_id = #{saleAttrValueId,jdbcType=BIGINT}");
        }
        
        if (record.getSaleAttrName() != null) {
            sql.SET("sale_attr_name = #{saleAttrName,jdbcType=VARCHAR}");
        }
        
        if (record.getSaleAttrValueName() != null) {
            sql.SET("sale_attr_value_name = #{saleAttrValueName,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("id = #{id,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_sku_sale_attr_value
     *
     * @mbg.generated
     */
    protected void applyWhere(SQL sql, SkuSaleAttrValueExample example, boolean includeExamplePhrase) {
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