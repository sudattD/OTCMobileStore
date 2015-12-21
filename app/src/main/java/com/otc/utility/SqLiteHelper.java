package com.otc.utility;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by davesuda on 12/11/2015.
 */
public class SqLiteHelper extends SQLiteOpenHelper {


    private static final String DATABASE_NAME = "OTC.db";
    private static final int DATABASE_VERSION = 1;



//##########################################################################################/////


    private static final String TABLE_CUSTOMER_DETAILS = "CustomerDetails";
    private static final String CUSTOMER_COLUMN_ID = "id";
    private static final String CUSTOMER_FIRST_NAME = "FirstName";
    private static final String CUSTOMER_LAST_NAME  = "LastName";
    private static final String CUSTOMER_OTC_CARD = "OtcCard";
    private static final String CUSTOMER_EMAIL = "Email";
    private static final String CUSTOMER_MOBILE = "Mobile";
    private static final String CUSTOMER_STREET = "Street";
    private static final String CUSTOMER_CITY = "City";
    private static final String CUSTOMER_STATE = "State";
    private static final String CUSTOMER_POSTAL_CODE = "PostalCode";
    private static final String CUSTOMER_COUNTRY_ID = "CountryId";
    private static final String CUSTOMER_CREATED_AT = "CreatedAt";
    private static final String CUSTOMER_UPDATED_AT = "UpdatedAt";



//##########################################################################################/////



    private static final String TABLE_TICKETS_DETAIL = "CustomerTickets";
    private static final String TICKETS_ID = "TicketId";
    private static final String TICKETS_TITLE = "Title";
    private static final String TICKETS_DESCRIPTION = "Description";
    private static final String TICKETS_NOTES = "Notes";
    private static final String TICKETS_RESOLUTION = "Resolution";
    private static final String TICKETS_SEVERITY = "Severity";
    private static final String TICKETS_STATUS = "Status";
    private static final String TICKETS_CREATED = "CreatedAt";
    private static final String TICKETS_UPDATED = "UpdatedAt";

//##########################################################################################/////


    private static final String TABLE_CATEGORY_DETAIL = "CategoryDetails";
    private static final String CATEGORY_ID = "categoryId";
    private static final String PARENT_ID = "parentId";
    private static final String NAME = "name";
    private static final String CREATED_AT = "CreatedAt";
    private static final String UPDATED_AT = "UpdatedAt";

//##########################################################################################/////


    private static final String TABLE_PRODUCT_DETAIL = "ProductDetails";
    private static final String PRO_CATEGORY_ID = "categoryId";
    private static final String PRO_NAME = "productName";
    private static final String PRO_DESCRIPTION = "productdesc";
    private static final String PRO_SKU = "prosku";
    private static final String PRO_PRICE = "proPrice";
    private static final String PRO_TAXABLE = "isTaxable";
    private static final String PRO_QUANTITY = "quantity";
    private static final String PRO_CREATED_AT = "CreatedAt";
    private static final String PRO_UPDATED_AT = "UpdatedAt";


//##########################################################################################/////


    private static final String TABLE_SETTINGS = "SettingsDetails";
    private static final String SETTINGS_ID = "SettingsId";
    private static final String LAST_SYNC = "LastSync";
    private static final String TAG_LINE = "TagLine";
    private static final String FOOTER_TEXT = "FooterText";
    private static final String SETTINGS_UPDATED_DATETIME = "updatedDateTime";


//##########################################################################################/////

    private static final String TABLE_LOGS = "LogsTableDetails";
    private static final String LOG_DATA = "LogData";
    private static final String LOG_DETAIL = "LogDetails";
    private static final String LOGS_DATETIME = "LogsDateTime";


//##########################################################################################/////



    Context mContext;
    private SQLiteDatabase db;

    public SqLiteHelper(Context context)
    {
        super(context,DATABASE_NAME,null,DATABASE_VERSION);
        this.mContext = context;
        this.db = this.getWritableDatabase();
    }


    public SqLiteHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {


        String CREATE_CUSTOMER_DETAILS_TABLE = "CREATE TABLE "
                + TABLE_CUSTOMER_DETAILS + "("
                + CUSTOMER_COLUMN_ID + " INTEGER PRIMARY KEY,"
                + CUSTOMER_FIRST_NAME + " TEXT,"
                + CUSTOMER_LAST_NAME + " TEXT,"
                + CUSTOMER_OTC_CARD + " TEXT,"
                + CUSTOMER_EMAIL + " TEXT,"
                + CUSTOMER_MOBILE + " TEXT,"
                + CUSTOMER_STREET + " TEXT,"
                + CUSTOMER_CITY + " TEXT,"
                + CUSTOMER_STATE + " TEXT,"
                + CUSTOMER_POSTAL_CODE + " TEXT,"
                + CUSTOMER_COUNTRY_ID + " TEXT,"
                + CUSTOMER_CREATED_AT + " TEXT,"
                + CUSTOMER_UPDATED_AT + " TEXT"
                + ")";

        String CREATE_CUSTOMER_TICKETS = "CREATE TABLE "
                + TABLE_TICKETS_DETAIL + "("
                + TICKETS_ID + " INTEGER PRIMARY KEY,"
                + TICKETS_TITLE + " TEXT,"
                + TICKETS_DESCRIPTION + " TEXT,";//incomplete from here

        db.execSQL(CREATE_CUSTOMER_DETAILS_TABLE);




    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
