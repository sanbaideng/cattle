/**
 * This class is generated by jOOQ
 */
package io.cattle.platform.core.model.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.3.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DynamicSchemaRoleTable extends org.jooq.impl.TableImpl<io.cattle.platform.core.model.tables.records.DynamicSchemaRoleRecord> {

	private static final long serialVersionUID = -1181528533;

	/**
	 * The singleton instance of <code>cattle.dynamic_schema_role</code>
	 */
	public static final io.cattle.platform.core.model.tables.DynamicSchemaRoleTable DYNAMIC_SCHEMA_ROLE = new io.cattle.platform.core.model.tables.DynamicSchemaRoleTable();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<io.cattle.platform.core.model.tables.records.DynamicSchemaRoleRecord> getRecordType() {
		return io.cattle.platform.core.model.tables.records.DynamicSchemaRoleRecord.class;
	}

	/**
	 * The column <code>cattle.dynamic_schema_role.id</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.DynamicSchemaRoleRecord, java.lang.Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>cattle.dynamic_schema_role.dynamic_schema_id</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.DynamicSchemaRoleRecord, java.lang.Long> DYNAMIC_SCHEMA_ID = createField("dynamic_schema_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>cattle.dynamic_schema_role.role</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.DynamicSchemaRoleRecord, java.lang.String> ROLE = createField("role", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

	/**
	 * Create a <code>cattle.dynamic_schema_role</code> table reference
	 */
	public DynamicSchemaRoleTable() {
		this("dynamic_schema_role", null);
	}

	/**
	 * Create an aliased <code>cattle.dynamic_schema_role</code> table reference
	 */
	public DynamicSchemaRoleTable(java.lang.String alias) {
		this(alias, io.cattle.platform.core.model.tables.DynamicSchemaRoleTable.DYNAMIC_SCHEMA_ROLE);
	}

	private DynamicSchemaRoleTable(java.lang.String alias, org.jooq.Table<io.cattle.platform.core.model.tables.records.DynamicSchemaRoleRecord> aliased) {
		this(alias, aliased, null);
	}

	private DynamicSchemaRoleTable(java.lang.String alias, org.jooq.Table<io.cattle.platform.core.model.tables.records.DynamicSchemaRoleRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, io.cattle.platform.core.model.CattleTable.CATTLE, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<io.cattle.platform.core.model.tables.records.DynamicSchemaRoleRecord, java.lang.Long> getIdentity() {
		return io.cattle.platform.core.model.Keys.IDENTITY_DYNAMIC_SCHEMA_ROLE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<io.cattle.platform.core.model.tables.records.DynamicSchemaRoleRecord> getPrimaryKey() {
		return io.cattle.platform.core.model.Keys.KEY_DYNAMIC_SCHEMA_ROLE_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<io.cattle.platform.core.model.tables.records.DynamicSchemaRoleRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<io.cattle.platform.core.model.tables.records.DynamicSchemaRoleRecord>>asList(io.cattle.platform.core.model.Keys.KEY_DYNAMIC_SCHEMA_ROLE_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<io.cattle.platform.core.model.tables.records.DynamicSchemaRoleRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<io.cattle.platform.core.model.tables.records.DynamicSchemaRoleRecord, ?>>asList(io.cattle.platform.core.model.Keys.FK_DYNAMIC_SCHEMA_ROLE_DYNAMIC_SCHEMA_ID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public io.cattle.platform.core.model.tables.DynamicSchemaRoleTable as(java.lang.String alias) {
		return new io.cattle.platform.core.model.tables.DynamicSchemaRoleTable(alias, this);
	}

	/**
	 * Rename this table
	 */
	public io.cattle.platform.core.model.tables.DynamicSchemaRoleTable rename(java.lang.String name) {
		return new io.cattle.platform.core.model.tables.DynamicSchemaRoleTable(name, null);
	}
}