package defpackage;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.io.File;

/* loaded from: classes2.dex */
public final class yd implements uuc {
    public final Context b;
    public final qra c;
    public final af7 e;
    public final String d = "MAX";
    public final khe f = new khe(new x5(7, this));

    public yd(Context context, qra qraVar, af7 af7Var) {
        this.b = context;
        this.c = qraVar;
        this.e = af7Var;
    }

    public final Uri c(vuc vucVar, String str) {
        String strD = vucVar.d();
        int iA = vucVar.a();
        long jCurrentTimeMillis = System.currentTimeMillis();
        File file = new File(strD, this.d);
        kpa[] kpaVarArr = {new kpa("_display_name", str), new kpa("mime_type", ey8.f(iA)), new kpa("date_added", Long.valueOf(jCurrentTimeMillis)), new kpa("date_modified", Long.valueOf(jCurrentTimeMillis)), new kpa("relative_path", file + File.separator)};
        ContentValues contentValues = new ContentValues(5);
        for (int i = 0; i < 5; i++) {
            kpa kpaVar = kpaVarArr[i];
            String str2 = (String) kpaVar.a;
            Object obj = kpaVar.b;
            if (obj == null) {
                contentValues.putNull(str2);
            } else if (obj instanceof String) {
                contentValues.put(str2, (String) obj);
            } else if (obj instanceof Integer) {
                contentValues.put(str2, (Integer) obj);
            } else if (obj instanceof Long) {
                contentValues.put(str2, (Long) obj);
            } else if (obj instanceof Boolean) {
                contentValues.put(str2, (Boolean) obj);
            } else if (obj instanceof Float) {
                contentValues.put(str2, (Float) obj);
            } else if (obj instanceof Double) {
                contentValues.put(str2, (Double) obj);
            } else if (obj instanceof byte[]) {
                contentValues.put(str2, (byte[]) obj);
            } else if (obj instanceof Byte) {
                contentValues.put(str2, (Byte) obj);
            } else {
                if (!(obj instanceof Short)) {
                    throw new IllegalArgumentException("Illegal value type " + obj.getClass().getCanonicalName() + " for key \"" + str2 + '\"');
                }
                contentValues.put(str2, (Short) obj);
            }
        }
        Integer numE = vucVar.e();
        if (numE != null) {
            contentValues.put("_size", Integer.valueOf(numE.intValue()));
        }
        Integer width = vucVar.getWidth();
        if (width != null) {
            contentValues.put("width", Integer.valueOf(width.intValue()));
        }
        Integer height = vucVar.getHeight();
        if (height != null) {
            contentValues.put("height", Integer.valueOf(height.intValue()));
        }
        contentValues.put("is_pending", (Integer) 1);
        khe kheVar = this.f;
        Uri uriInsert = ((ContentResolver) kheVar.getValue()).insert(vucVar.c(), contentValues);
        if (uriInsert == null) {
            return null;
        }
        vucVar.b((ContentResolver) kheVar.getValue(), uriInsert);
        contentValues.clear();
        contentValues.put("is_pending", (Integer) 0);
        ((ContentResolver) kheVar.getValue()).update(uriInsert, contentValues, null, null);
        Context context = this.b;
        Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
        intent.setData(uriInsert);
        intent.addFlags(1);
        try {
            context.sendBroadcast(intent);
        } catch (Exception e) {
            tuc tucVar = tuc.a;
            hm9.p(tuc.b, "sendBroadcastToGallery: failed for uri " + uriInsert, e);
        }
        return uriInsert;
    }
}
