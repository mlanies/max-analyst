package defpackage;

import android.net.Uri;
import android.provider.MediaStore;

/* loaded from: classes2.dex */
public final class t76 extends u76 {
    public static final t76 f = new t76();
    public static final Uri g = MediaStore.Video.Media.getContentUri("external");
    public static final String h = "_id";
    public static final String i = "bucket_id";
    public static final String j = "bucket_display_name";
    public static final String k = "_data";
    public static final String l = "date_modified";
    public static final String m = "mime_type";
    public static final String n = "duration";
    public static final String o = "video/mp4";

    @Override // defpackage.u76
    public final String a() {
        return j;
    }

    @Override // defpackage.u76
    public final String b() {
        return i;
    }

    @Override // defpackage.u76
    public final String c() {
        return k;
    }

    @Override // defpackage.u76
    public final String d() {
        return l;
    }

    @Override // defpackage.u76
    public final String e() {
        return n;
    }

    @Override // defpackage.u76
    public final String f() {
        return h;
    }

    @Override // defpackage.u76
    public final String g() {
        return m;
    }

    @Override // defpackage.u76
    public final Uri i() {
        return g;
    }

    @Override // defpackage.u76
    public final String j() {
        return o;
    }
}
