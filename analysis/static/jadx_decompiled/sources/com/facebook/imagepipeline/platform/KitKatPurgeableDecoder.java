package com.facebook.imagepipeline.platform;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder;
import defpackage.o43;
import defpackage.od2;
import defpackage.pm4;
import defpackage.qq8;
import defpackage.v84;
import defpackage.wm5;

@TargetApi(19)
@pm4
/* loaded from: classes.dex */
public class KitKatPurgeableDecoder extends DalvikPurgeableDecoder {
    public final wm5 c;

    @pm4
    public KitKatPurgeableDecoder(wm5 wm5Var) {
        this.c = wm5Var;
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    public final Bitmap b(o43 o43Var, BitmapFactory.Options options) {
        qq8 qq8Var = (qq8) o43Var.e0();
        int iU = qq8Var.U();
        v84 v84VarA = this.c.a(iU);
        try {
            byte[] bArr = (byte[]) v84VarA.e0();
            qq8Var.S(0, 0, iU, bArr);
            Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, iU, options);
            od2.o(bitmapDecodeByteArray, "BitmapFactory returned null");
            return bitmapDecodeByteArray;
        } finally {
            o43.S(v84VarA);
        }
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    public final Bitmap c(o43 o43Var, int i, BitmapFactory.Options options) {
        byte[] bArr = DalvikPurgeableDecoder.e(i, o43Var) ? null : DalvikPurgeableDecoder.b;
        qq8 qq8Var = (qq8) o43Var.e0();
        if (!(i <= qq8Var.U())) {
            throw new IllegalArgumentException();
        }
        int i2 = i + 2;
        v84 v84VarA = this.c.a(i2);
        try {
            byte[] bArr2 = (byte[]) v84VarA.e0();
            qq8Var.S(0, 0, i, bArr2);
            if (bArr != null) {
                bArr2[i] = -1;
                bArr2[i + 1] = -39;
                i = i2;
            }
            Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr2, 0, i, options);
            od2.o(bitmapDecodeByteArray, "BitmapFactory returned null");
            return bitmapDecodeByteArray;
        } finally {
            o43.S(v84VarA);
        }
    }
}
