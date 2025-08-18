package defpackage;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class oo0 implements vuc {
    public final Bitmap a;
    public int b;
    public final int c;
    public final int d;
    public final Serializable e;
    public final Object f;

    public oo0(String str, Bitmap bitmap) {
        this.a = bitmap;
        this.e = str;
        this.b = bitmap.getByteCount();
        this.c = bitmap.getWidth();
        this.d = bitmap.getHeight();
        this.f = MediaStore.Images.Media.getContentUri("external_primary");
    }

    @Override // defpackage.vuc
    public int a() {
        return 2;
    }

    @Override // defpackage.vuc
    public void b(ContentResolver contentResolver, Uri uri) throws FileNotFoundException {
        OutputStream outputStreamOpenOutputStream = contentResolver.openOutputStream(uri, "w");
        if (outputStreamOpenOutputStream != null) {
            try {
                this.a.compress(Bitmap.CompressFormat.JPEG, 100, outputStreamOpenOutputStream);
                v3c.i(outputStreamOpenOutputStream, null);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    v3c.i(outputStreamOpenOutputStream, th);
                    throw th2;
                }
            }
        }
    }

    @Override // defpackage.vuc
    public Uri c() {
        return (Uri) this.f;
    }

    @Override // defpackage.vuc
    public String d() {
        return (String) this.e;
    }

    @Override // defpackage.vuc
    public Integer e() {
        return Integer.valueOf(this.b);
    }

    @Override // defpackage.vuc
    public void f(File file) {
        FileOutputStream fileOutputStream = new FileOutputStream(file.getAbsoluteFile());
        try {
            this.a.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
            v3c.i(fileOutputStream, null);
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x01b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.c8d g() {
        /*
            Method dump skipped, instructions count: 485
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oo0.g():c8d");
    }

    @Override // defpackage.vuc
    public Integer getHeight() {
        return Integer.valueOf(this.d);
    }

    @Override // defpackage.vuc
    public Integer getWidth() {
        return Integer.valueOf(this.c);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public oo0(Bitmap bitmap, int i) {
        this(Environment.DIRECTORY_PICTURES, bitmap);
        switch (i) {
            case 1:
                ArrayList arrayList = new ArrayList();
                this.e = arrayList;
                this.b = 16;
                this.c = 12544;
                this.d = -1;
                ArrayList arrayList2 = new ArrayList();
                this.f = arrayList2;
                if (!bitmap.isRecycled()) {
                    arrayList2.add(c8d.Y);
                    this.a = bitmap;
                    arrayList.add(bne.d);
                    arrayList.add(bne.e);
                    arrayList.add(bne.f);
                    arrayList.add(bne.g);
                    arrayList.add(bne.h);
                    arrayList.add(bne.i);
                    return;
                }
                throw new IllegalArgumentException("Bitmap is not valid");
            default:
                return;
        }
    }
}
