package org.apache.http.protocol;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

@Deprecated
/* loaded from: classes2.dex */
public class HttpDateGenerator {
    public static final TimeZone GMT = TimeZone.getTimeZone("GMT");
    public static final String PATTERN_RFC1123 = "EEE, dd MMM yyyy HH:mm:ss zzz";
    private long dateAsLong = 0;
    private String dateAsText = null;
    private final DateFormat dateformat;

    public HttpDateGenerator() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
        this.dateformat = simpleDateFormat;
        simpleDateFormat.setTimeZone(GMT);
    }

    public synchronized String getCurrentDate() {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - this.dateAsLong > 1000) {
                this.dateAsText = this.dateformat.format(new Date(jCurrentTimeMillis));
                this.dateAsLong = jCurrentTimeMillis;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.dateAsText;
    }
}
