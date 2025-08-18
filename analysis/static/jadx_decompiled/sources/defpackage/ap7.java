package defpackage;

import android.content.ContentResolver;
import android.database.Cursor;
import android.graphics.Rect;
import android.media.ExifInterface;
import android.net.Uri;
import android.provider.MediaStore;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class ap7 extends jp7 implements nte {
    public static final String[] d = {"_id", "_data"};
    public static final String[] e = {"_data"};
    public static final Rect f = new Rect(0, 0, 512, 384);
    public static final Rect g = new Rect(0, 0, 96, 96);
    public final ContentResolver c;

    public ap7(Executor executor, y7g y7gVar, ContentResolver contentResolver) {
        super(executor, y7gVar);
        this.c = contentResolver;
    }

    @Override // defpackage.nte
    public final boolean b(jic jicVar) {
        Rect rect = f;
        return tu0.p(rect.width(), rect.height(), jicVar);
    }

    @Override // defpackage.jp7
    public final g05 d(wv6 wv6Var) {
        jic jicVar;
        g05 g05VarF;
        int iQ;
        Uri uri = wv6Var.b;
        if (!e9f.d(uri) || (jicVar = wv6Var.i) == null) {
            return null;
        }
        Cursor cursorQuery = this.c.query(uri, d, null, null, null);
        if (cursorQuery == null) {
            return null;
        }
        try {
            if (!cursorQuery.moveToFirst() || (g05VarF = f(jicVar, cursorQuery.getLong(cursorQuery.getColumnIndex("_id")))) == null) {
                return null;
            }
            int columnIndex = cursorQuery.getColumnIndex("_data");
            if (columnIndex >= 0) {
                String string = cursorQuery.getString(columnIndex);
                if (string != null) {
                    try {
                        iQ = oag.q(new ExifInterface(string).getAttributeInt("Orientation", 1));
                    } catch (IOException e2) {
                        if (ta5.a.i(6)) {
                            ta5.a.e(ap7.class.getSimpleName(), "Unable to retrieve thumbnail rotation for ".concat(string), e2);
                        }
                    }
                    g05VarF.o = iQ;
                } else {
                    iQ = 0;
                    g05VarF.o = iQ;
                }
            }
            return g05VarF;
        } finally {
            cursorQuery.close();
        }
    }

    @Override // defpackage.jp7
    public final String e() {
        return "LocalContentUriThumbnailFetchProducer";
    }

    public final g05 f(jic jicVar, long j) {
        int i;
        int columnIndex;
        Rect rect = g;
        if (tu0.p(rect.width(), rect.height(), jicVar)) {
            i = 3;
        } else {
            Rect rect2 = f;
            i = tu0.p(rect2.width(), rect2.height(), jicVar) ? 1 : 0;
        }
        if (i == 0) {
            return null;
        }
        Cursor cursorQueryMiniThumbnail = MediaStore.Images.Thumbnails.queryMiniThumbnail(this.c, j, i, e);
        if (cursorQueryMiniThumbnail == null) {
            return null;
        }
        try {
            if (cursorQueryMiniThumbnail.moveToFirst() && (columnIndex = cursorQueryMiniThumbnail.getColumnIndex("_data")) >= 0) {
                String string = cursorQueryMiniThumbnail.getString(columnIndex);
                string.getClass();
                if (new File(string).exists()) {
                    return c(new FileInputStream(string), (int) new File(string).length());
                }
            }
            return null;
        } finally {
            cursorQueryMiniThumbnail.close();
        }
    }
}
