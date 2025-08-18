package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: classes.dex */
public abstract class cs6 {
    public static IconCompat a(Icon icon) {
        icon.getClass();
        int iC = es6.c(icon);
        if (iC == 2) {
            return IconCompat.d(null, es6.b(icon), es6.a(icon));
        }
        if (iC == 4) {
            Uri uriB = b(icon);
            PorterDuff.Mode mode = IconCompat.k;
            uriB.getClass();
            String string = uriB.toString();
            string.getClass();
            IconCompat iconCompat = new IconCompat(4);
            iconCompat.b = string;
            return iconCompat;
        }
        if (iC != 6) {
            IconCompat iconCompat2 = new IconCompat(-1);
            iconCompat2.b = icon;
            return iconCompat2;
        }
        Uri uriB2 = b(icon);
        PorterDuff.Mode mode2 = IconCompat.k;
        uriB2.getClass();
        String string2 = uriB2.toString();
        string2.getClass();
        IconCompat iconCompat3 = new IconCompat(6);
        iconCompat3.b = string2;
        return iconCompat3;
    }

    public static Uri b(Object obj) {
        return es6.d(obj);
    }

    public static Drawable c(Icon icon, Context context) {
        return icon.loadDrawable(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.drawable.Icon d(androidx.core.graphics.drawable.IconCompat r3, android.content.Context r4) throws java.io.FileNotFoundException {
        /*
            int r0 = r3.a
            switch(r0) {
                case -1: goto Ld6;
                case 0: goto L5;
                case 1: goto Lbd;
                case 2: goto Lb2;
                case 3: goto La5;
                case 4: goto L9c;
                case 5: goto L93;
                case 6: goto Ld;
                default: goto L5;
            }
        L5:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "Unknown type"
            r3.<init>(r4)
            throw r3
        Ld:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L1d
            android.net.Uri r4 = r3.g()
            android.graphics.drawable.Icon r4 = defpackage.fs6.a(r4)
            goto Lc5
        L1d:
            if (r4 == 0) goto L7b
            android.net.Uri r0 = r3.g()
            java.lang.String r1 = r0.getScheme()
            java.lang.String r2 = "content"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L4b
            java.lang.String r2 = "file"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L38
            goto L4b
        L38:
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch: java.io.FileNotFoundException -> L47
            java.io.File r1 = new java.io.File     // Catch: java.io.FileNotFoundException -> L47
            java.lang.Object r2 = r3.b     // Catch: java.io.FileNotFoundException -> L47
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.io.FileNotFoundException -> L47
            r1.<init>(r2)     // Catch: java.io.FileNotFoundException -> L47
            r4.<init>(r1)     // Catch: java.io.FileNotFoundException -> L47
            goto L58
        L47:
            r0.toString()
            goto L57
        L4b:
            android.content.ContentResolver r4 = r4.getContentResolver()     // Catch: java.lang.Exception -> L54
            java.io.InputStream r4 = r4.openInputStream(r0)     // Catch: java.lang.Exception -> L54
            goto L58
        L54:
            r0.toString()
        L57:
            r4 = 0
        L58:
            if (r4 == 0) goto L63
            android.graphics.Bitmap r4 = android.graphics.BitmapFactory.decodeStream(r4)
            android.graphics.drawable.Icon r4 = defpackage.ds6.b(r4)
            goto Lc5
        L63:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Cannot load adaptive icon from uri: "
            r0.<init>(r1)
            android.net.Uri r3 = r3.g()
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
            throw r4
        L7b:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Context is required to resolve the file uri of the icon: "
            r0.<init>(r1)
            android.net.Uri r3 = r3.g()
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
            throw r4
        L93:
            java.lang.Object r4 = r3.b
            android.graphics.Bitmap r4 = (android.graphics.Bitmap) r4
            android.graphics.drawable.Icon r4 = defpackage.ds6.b(r4)
            goto Lc5
        L9c:
            java.lang.Object r4 = r3.b
            java.lang.String r4 = (java.lang.String) r4
            android.graphics.drawable.Icon r4 = android.graphics.drawable.Icon.createWithContentUri(r4)
            goto Lc5
        La5:
            java.lang.Object r4 = r3.b
            byte[] r4 = (byte[]) r4
            int r0 = r3.e
            int r1 = r3.f
            android.graphics.drawable.Icon r4 = android.graphics.drawable.Icon.createWithData(r4, r0, r1)
            goto Lc5
        Lb2:
            java.lang.String r4 = r3.f()
            int r0 = r3.e
            android.graphics.drawable.Icon r4 = android.graphics.drawable.Icon.createWithResource(r4, r0)
            goto Lc5
        Lbd:
            java.lang.Object r4 = r3.b
            android.graphics.Bitmap r4 = (android.graphics.Bitmap) r4
            android.graphics.drawable.Icon r4 = android.graphics.drawable.Icon.createWithBitmap(r4)
        Lc5:
            android.content.res.ColorStateList r0 = r3.g
            if (r0 == 0) goto Lcc
            r4.setTintList(r0)
        Lcc:
            android.graphics.PorterDuff$Mode r3 = r3.h
            android.graphics.PorterDuff$Mode r0 = androidx.core.graphics.drawable.IconCompat.k
            if (r3 == r0) goto Ld5
            r4.setTintMode(r3)
        Ld5:
            return r4
        Ld6:
            java.lang.Object r3 = r3.b
            android.graphics.drawable.Icon r3 = (android.graphics.drawable.Icon) r3
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cs6.d(androidx.core.graphics.drawable.IconCompat, android.content.Context):android.graphics.drawable.Icon");
    }
}
