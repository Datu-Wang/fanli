package com.datu.fanli.manage.dao;

import com.datu.fanli.bean.ProductImage;
import com.datu.fanli.bean.ProductImageExample.Criteria;
import com.datu.fanli.bean.ProductImageExample.Criterion;
import com.datu.fanli.bean.ProductImageExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

/**
 * @author: datu
 * @date: 2020/1/15
 */
public class ProductImageSqlProvider {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_image
     *
     * @mbg.generated
     */
    public String countByExample(ProductImageExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("pms_product_image");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_image
     *
     * @mbg.generated
     */
    public String deleteByExample(ProductImageExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("pms_product_image");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_image
     *
     * @mbg.generated
     */
    public String insertSelective(ProductImage record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("pms_product_image");
        
        if (record.getProductId() != null) {
            sql.VALUES("product_id", "#{productId,jdbcType=BIGINT}");
        }
        
        if (record.getImgName() != null) {
            sql.VALUES("img_name", "#{imgName,jdbcType=VARCHAR}");
        }
        
        if (record.getImgUrl() != null) {
            sql.VALUES("img_url", "#{imgUrl,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_image
     *
     * @mbg.generated
     */
    public String selectByExample(ProductImageExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("product_id");
        sql.SELECT("img_name");
        sql.SELECT("img_url");
        sql.FROM("pms_product_image");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_image
     *
     * @mbg.generated
     */
    public String updateByExampleSelective(Map<String, Object> parameter) {
        ProductImage record = (ProductImage) parameter.get("record");
        ProductImageExample example = (ProductImageExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("pms_product_image");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=BIGINT}");
        }
        
        if (record.getProductId() != null) {
            sql.SET("product_id = #{record.productId,jdbcType=BIGINT}");
        }
        
        if (record.getImgName() != null) {
            sql.SET("img_name = #{record.imgName,jdbcType=VARCHAR}");
        }
        
        if (record.getImgUrl() != null) {
            sql.SET("img_url = #{record.imgUrl,jdbcType=VARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_image
     *
     * @mbg.generated
     */
    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("pms_product_image");
        
        sql.SET("id = #{record.id,jdbcType=BIGINT}");
        sql.SET("product_id = #{record.productId,jdbcType=BIGINT}");
        sql.SET("img_name = #{record.imgName,jdbcType=VARCHAR}");
        sql.SET("img_url = #{record.imgUrl,jdbcType=VARCHAR}");
        
        ProductImageExample example = (ProductImageExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_image
     *
     * @mbg.generated
     */
    public String updateByPrimaryKeySelective(ProductImage record) {
        SQL sql = new SQL();
        sql.UPDATE("pms_product_image");
        
        if (record.getProductId() != null) {
            sql.SET("product_id = #{productId,jdbcType=BIGINT}");
        }
        
        if (record.getImgName() != null) {
            sql.SET("img_name = #{imgName,jdbcType=VARCHAR}");
        }
        
        if (record.getImgUrl() != null) {
            sql.SET("img_url = #{imgUrl,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("id = #{id,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_image
     *
     * @mbg.generated
     */
    protected void applyWhere(SQL sql, ProductImageExample example, boolean includeExamplePhrase) {
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