package bigdata3.dao;

import java.util.List;

import bigdata3.domain.Template;

public interface TemplateDao {
  public List<Template> selectByTempType(String templateType);
  public void insert(Template template);
  public void update(Template template);
  public void delete(int templateNo);
}
