/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package org.kaaproject.kaa.server.admin.services.entity.gen;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class GeneralProperties extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"GeneralProperties\",\"namespace\":\"org.kaaproject.kaa.server.admin.services.entity.gen\",\"fields\":[{\"name\":\"appTitle\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"displayName\":\"Application title\",\"maxLength\":1000,\"by_default\":\"Kaa\"},{\"name\":\"baseUrl\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"displayName\":\"Base URL\",\"by_default\":\"http://localhost:8080\"}]}");
  private java.lang.String appTitle;
  private java.lang.String baseUrl;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use {@link \#newBuilder()}.
   */
  public GeneralProperties() {
  }

  /**
   * All-args constructor.
   */
  public GeneralProperties(java.lang.String appTitle, java.lang.String baseUrl) {
    this.appTitle = appTitle;
    this.baseUrl = baseUrl;
  }

  public static org.apache.avro.Schema getClassSchema() {
    return SCHEMA$;
  }

  /**
   * Creates a new GeneralProperties RecordBuilder
   */
  public static org.kaaproject.kaa.server.admin.services.entity.gen.GeneralProperties.Builder newBuilder() {
    return new org.kaaproject.kaa.server.admin.services.entity.gen.GeneralProperties.Builder();
  }

  /**
   * Creates a new GeneralProperties RecordBuilder by copying an existing Builder
   */
  public static org.kaaproject.kaa.server.admin.services.entity.gen.GeneralProperties.Builder newBuilder(org.kaaproject.kaa.server.admin.services.entity.gen.GeneralProperties.Builder other) {
    return new org.kaaproject.kaa.server.admin.services.entity.gen.GeneralProperties.Builder(other);
  }

  /**
   * Creates a new GeneralProperties RecordBuilder by copying an existing GeneralProperties instance
   */
  public static org.kaaproject.kaa.server.admin.services.entity.gen.GeneralProperties.Builder newBuilder(org.kaaproject.kaa.server.admin.services.entity.gen.GeneralProperties other) {
    return new org.kaaproject.kaa.server.admin.services.entity.gen.GeneralProperties.Builder(other);
  }

  public org.apache.avro.Schema getSchema() {
    return SCHEMA$;
  }

  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
      case 0:
        return appTitle;
      case 1:
        return baseUrl;
      default:
        throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value = "unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
      case 0:
        appTitle = (java.lang.String) value$;
        break;
      case 1:
        baseUrl = (java.lang.String) value$;
        break;
      default:
        throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'appTitle' field.
   */
  public java.lang.String getAppTitle() {
    return appTitle;
  }

  /**
   * Sets the value of the 'appTitle' field.
   *
   * @param value the value to set.
   */
  public void setAppTitle(java.lang.String value) {
    this.appTitle = value;
  }

  /**
   * Gets the value of the 'baseUrl' field.
   */
  public java.lang.String getBaseUrl() {
    return baseUrl;
  }

  /**
   * Sets the value of the 'baseUrl' field.
   *
   * @param value the value to set.
   */
  public void setBaseUrl(java.lang.String value) {
    this.baseUrl = value;
  }

  /**
   * RecordBuilder for GeneralProperties instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<GeneralProperties>
      implements org.apache.avro.data.RecordBuilder<GeneralProperties> {

    private java.lang.String appTitle;
    private java.lang.String baseUrl;

    /**
     * Creates a new Builder
     */
    private Builder() {
      super(org.kaaproject.kaa.server.admin.services.entity.gen.GeneralProperties.SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder
     */
    private Builder(org.kaaproject.kaa.server.admin.services.entity.gen.GeneralProperties.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.appTitle)) {
        this.appTitle = data().deepCopy(fields()[0].schema(), other.appTitle);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.baseUrl)) {
        this.baseUrl = data().deepCopy(fields()[1].schema(), other.baseUrl);
        fieldSetFlags()[1] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing GeneralProperties instance
     */
    private Builder(org.kaaproject.kaa.server.admin.services.entity.gen.GeneralProperties other) {
      super(org.kaaproject.kaa.server.admin.services.entity.gen.GeneralProperties.SCHEMA$);
      if (isValidValue(fields()[0], other.appTitle)) {
        this.appTitle = data().deepCopy(fields()[0].schema(), other.appTitle);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.baseUrl)) {
        this.baseUrl = data().deepCopy(fields()[1].schema(), other.baseUrl);
        fieldSetFlags()[1] = true;
      }
    }

    /**
     * Gets the value of the 'appTitle' field
     */
    public java.lang.String getAppTitle() {
      return appTitle;
    }

    /**
     * Sets the value of the 'appTitle' field
     */
    public org.kaaproject.kaa.server.admin.services.entity.gen.GeneralProperties.Builder setAppTitle(java.lang.String value) {
      validate(fields()[0], value);
      this.appTitle = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
     * Checks whether the 'appTitle' field has been set
     */
    public boolean hasAppTitle() {
      return fieldSetFlags()[0];
    }

    /**
     * Clears the value of the 'appTitle' field
     */
    public org.kaaproject.kaa.server.admin.services.entity.gen.GeneralProperties.Builder clearAppTitle() {
      appTitle = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
     * Gets the value of the 'baseUrl' field
     */
    public java.lang.String getBaseUrl() {
      return baseUrl;
    }

    /**
     * Sets the value of the 'baseUrl' field
     */
    public org.kaaproject.kaa.server.admin.services.entity.gen.GeneralProperties.Builder setBaseUrl(java.lang.String value) {
      validate(fields()[1], value);
      this.baseUrl = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
     * Checks whether the 'baseUrl' field has been set
     */
    public boolean hasBaseUrl() {
      return fieldSetFlags()[1];
    }

    /**
     * Clears the value of the 'baseUrl' field
     */
    public org.kaaproject.kaa.server.admin.services.entity.gen.GeneralProperties.Builder clearBaseUrl() {
      baseUrl = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public GeneralProperties build() {
      try {
        GeneralProperties record = new GeneralProperties();
        record.appTitle = fieldSetFlags()[0] ? this.appTitle : (java.lang.String) defaultValue(fields()[0]);
        record.baseUrl = fieldSetFlags()[1] ? this.baseUrl : (java.lang.String) defaultValue(fields()[1]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
