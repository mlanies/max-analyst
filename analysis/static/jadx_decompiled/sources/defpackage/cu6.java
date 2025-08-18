package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.renderscript.Type;
import java.lang.reflect.Array;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class cu6 {
    public static final AtomicInteger b = new AtomicInteger();
    public static volatile boolean c = false;
    public final khe a;

    public cu6(Context context) {
        this.a = new khe(new hy4(context, 8));
    }

    public static Bitmap c(Bitmap bitmap, int i) {
        int i2;
        int i3 = i;
        if (i3 < 1) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i4 = width * height;
        int[] iArr = new int[i4];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        int i5 = width - 1;
        int i6 = height - 1;
        int i7 = i3 + i3;
        int i8 = i7 + 1;
        int[] iArr2 = new int[i4];
        int[] iArr3 = new int[i4];
        int[] iArr4 = new int[i4];
        int[] iArr5 = new int[Math.max(width, height)];
        int i9 = (i7 + 2) >> 1;
        int i10 = i9 * i9;
        int i11 = i10 * 256;
        int[] iArr6 = new int[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            iArr6[i12] = i12 / i10;
        }
        int[][] iArr7 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i8, 3);
        int i13 = i3 + 1;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (i14 < height) {
            int i17 = height;
            int i18 = -i3;
            int i19 = 0;
            int i20 = 0;
            int i21 = 0;
            int i22 = 0;
            int i23 = 0;
            int i24 = 0;
            int i25 = 0;
            int i26 = 0;
            int i27 = 0;
            while (i18 <= i3) {
                int i28 = i6;
                int[] iArr8 = iArr5;
                int i29 = iArr[Math.min(i5, Math.max(i18, 0)) + i15];
                int[] iArr9 = iArr7[i18 + i3];
                iArr9[0] = (i29 & 16711680) >> 16;
                iArr9[1] = (i29 & 65280) >> 8;
                iArr9[2] = i29 & 255;
                int iAbs = i13 - Math.abs(i18);
                int i30 = iArr9[0];
                int i31 = (i30 * iAbs) + i19;
                i19 = i31 >= i11 ? i11 : i31;
                int i32 = iArr9[1];
                int i33 = i13;
                int i34 = (i32 * iAbs) + i20;
                i20 = i34 >= i11 ? i11 : i34;
                int i35 = iArr9[2];
                int i36 = (iAbs * i35) + i21;
                i21 = i36 >= i11 ? i11 : i36;
                if (i18 > 0) {
                    i25 += i30;
                    i26 += i32;
                    i27 += i35;
                } else {
                    i22 += i30;
                    i23 += i32;
                    i24 += i35;
                }
                i18++;
                i6 = i28;
                iArr5 = iArr8;
                i13 = i33;
            }
            int i37 = i6;
            int i38 = i13;
            int[] iArr10 = iArr5;
            int i39 = i3;
            int i40 = 0;
            while (i40 < width) {
                iArr2[i15] = iArr6[i19];
                iArr3[i15] = iArr6[i20];
                iArr4[i15] = iArr6[i21];
                int i41 = i19 - i22;
                int i42 = i20 - i23;
                int i43 = i21 - i24;
                int[] iArr11 = iArr7[((i39 - i3) + i8) % i8];
                int i44 = i22 - iArr11[0];
                int i45 = i23 - iArr11[1];
                int i46 = i24 - iArr11[2];
                if (i14 == 0) {
                    i2 = i11;
                    iArr10[i40] = Math.min(i40 + i3 + 1, i5);
                } else {
                    i2 = i11;
                }
                int i47 = iArr[i16 + iArr10[i40]];
                int i48 = (i47 & 16711680) >> 16;
                iArr11[0] = i48;
                int i49 = (i47 & 65280) >> 8;
                iArr11[1] = i49;
                int i50 = i47 & 255;
                iArr11[2] = i50;
                int i51 = i25 + i48;
                int i52 = i26 + i49;
                int i53 = i27 + i50;
                i19 = i41 + i51;
                i20 = i42 + i52;
                i21 = i43 + i53;
                i39 = (i39 + 1) % i8;
                int[] iArr12 = iArr7[i39 % i8];
                int i54 = iArr12[0];
                i22 = i44 + i54;
                int i55 = iArr12[1];
                i23 = i45 + i55;
                int i56 = iArr12[2];
                i24 = i46 + i56;
                i25 = i51 - i54;
                i26 = i52 - i55;
                i27 = i53 - i56;
                i15++;
                i40++;
                i11 = i2;
            }
            i16 += width;
            i14++;
            height = i17;
            i6 = i37;
            iArr5 = iArr10;
            i13 = i38;
        }
        int i57 = i6;
        int i58 = i13;
        int[] iArr13 = iArr5;
        int i59 = height;
        int i60 = 0;
        while (i60 < width) {
            int i61 = -i3;
            int i62 = i61 * width;
            int i63 = 0;
            int i64 = 0;
            int i65 = 0;
            int i66 = 0;
            int i67 = 0;
            int i68 = 0;
            int i69 = 0;
            int i70 = 0;
            int i71 = 0;
            while (i61 <= i3) {
                int i72 = i8;
                int iMax = Math.max(0, i62) + i60;
                int[] iArr14 = iArr7[i61 + i3];
                iArr14[0] = iArr2[iMax];
                iArr14[1] = iArr3[iMax];
                iArr14[2] = iArr4[iMax];
                int iAbs2 = i58 - Math.abs(i61);
                i63 = (iArr2[iMax] * iAbs2) + i63;
                i64 = (iArr3[iMax] * iAbs2) + i64;
                i65 = (iArr4[iMax] * iAbs2) + i65;
                if (i61 > 0) {
                    i69 += iArr14[0];
                    i70 += iArr14[1];
                    i71 += iArr14[2];
                } else {
                    i66 += iArr14[0];
                    i67 += iArr14[1];
                    i68 += iArr14[2];
                }
                int i73 = i57;
                if (i61 < i73) {
                    i62 += width;
                }
                i61++;
                i57 = i73;
                i8 = i72;
            }
            int i74 = i8;
            int i75 = i57;
            int i76 = i3;
            int i77 = i59;
            int i78 = 0;
            int i79 = i60;
            while (i78 < i77) {
                iArr[i79] = (iArr[i79] & (-16777216)) | (iArr6[i63] << 16) | (iArr6[i64] << 8) | iArr6[i65];
                int i80 = i63 - i66;
                int i81 = i64 - i67;
                int i82 = i65 - i68;
                int[] iArr15 = iArr7[((i76 - i3) + i74) % i74];
                int i83 = i66 - iArr15[0];
                int i84 = i67 - iArr15[1];
                int i85 = i68 - iArr15[2];
                if (i60 == 0) {
                    iArr13[i78] = Math.min(i78 + i58, i75) * width;
                }
                int i86 = iArr13[i78] + i60;
                int i87 = iArr2[i86];
                iArr15[0] = i87;
                int i88 = iArr3[i86];
                iArr15[1] = i88;
                int i89 = iArr4[i86];
                iArr15[2] = i89;
                int i90 = i69 + i87;
                int i91 = i70 + i88;
                int i92 = i71 + i89;
                i63 = i80 + i90;
                i64 = i81 + i91;
                i65 = i82 + i92;
                i76 = (i76 + 1) % i74;
                int[] iArr16 = iArr7[i76];
                int i93 = iArr16[0];
                i66 = i83 + i93;
                int i94 = iArr16[1];
                i67 = i84 + i94;
                int i95 = iArr16[2];
                i68 = i85 + i95;
                i69 = i90 - i93;
                i70 = i91 - i94;
                i71 = i92 - i95;
                i79 += width;
                i78++;
                i3 = i;
            }
            i60++;
            i3 = i;
            i59 = i77;
            i57 = i75;
            i8 = i74;
        }
        bitmap.setPixels(iArr, 0, width, 0, 0, width, i59);
        return bitmap;
    }

    public final Bitmap a(Bitmap bitmap, int i) {
        if (c) {
            return c(bitmap, i);
        }
        try {
            if (b.incrementAndGet() == 2) {
                b(bitmap, i);
            } else {
                d(bitmap, i);
            }
            return bitmap;
        } catch (Throwable th) {
            hm9.p("cu6", "blur: failed to blur image with renderscript, try with old blur", th);
            if (th instanceof OutOfMemoryError) {
                throw th;
            }
            return c(bitmap, i);
        }
    }

    public final void b(Bitmap bitmap, int i) throws Throwable {
        long jNanoTime = System.nanoTime();
        Bitmap bitmapC = c(bitmap, i);
        long jAbs = Math.abs(System.nanoTime() - jNanoTime);
        hm9.m("cu6", "checkRsSpeedAndForceOldBlur: time for old blur %d, tempWidth=%d", Long.valueOf(jAbs), Integer.valueOf(bitmapC.getWidth()));
        long jNanoTime2 = System.nanoTime();
        d(bitmap, i);
        long jAbs2 = Math.abs(System.nanoTime() - jNanoTime2);
        hm9.m("cu6", "checkRsSpeedAndForceOldBlur: time for rs blur %d", Long.valueOf(jAbs2));
        if (jAbs2 > jAbs * 3) {
            c = true;
        }
    }

    public final void d(Bitmap bitmap, int i) throws Throwable {
        ScriptIntrinsicBlur scriptIntrinsicBlur;
        Type type;
        Allocation allocationCreateTyped;
        RenderScript renderScript;
        Allocation allocationCreateFromBitmap;
        Allocation allocation = null;
        ScriptIntrinsicBlur scriptIntrinsicBlurCreate = null;
        try {
            renderScript = (RenderScript) this.a.getValue();
            allocationCreateFromBitmap = Allocation.createFromBitmap(renderScript, bitmap, Allocation.MipmapControl.MIPMAP_NONE, 1);
            try {
                type = allocationCreateFromBitmap.getType();
                try {
                    allocationCreateTyped = Allocation.createTyped(renderScript, type);
                } catch (Throwable th) {
                    th = th;
                    scriptIntrinsicBlur = null;
                    allocationCreateTyped = null;
                }
            } catch (Throwable th2) {
                th = th2;
                scriptIntrinsicBlur = null;
                type = null;
                allocationCreateTyped = null;
            }
        } catch (Throwable th3) {
            th = th3;
            scriptIntrinsicBlur = null;
            type = null;
            allocationCreateTyped = null;
        }
        try {
            scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScript, Element.U8_4(renderScript));
            scriptIntrinsicBlurCreate.setRadius(i);
            scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
            scriptIntrinsicBlurCreate.forEach(allocationCreateTyped);
            allocationCreateTyped.copyTo(bitmap);
            try {
                allocationCreateFromBitmap.destroy();
            } catch (Exception unused) {
            }
            try {
                allocationCreateTyped.destroy();
            } catch (Exception unused2) {
            }
            try {
                scriptIntrinsicBlurCreate.destroy();
            } catch (Exception unused3) {
            }
            if (type != null) {
                try {
                    type.destroy();
                } catch (Exception unused4) {
                }
            }
        } catch (Throwable th4) {
            th = th4;
            scriptIntrinsicBlur = scriptIntrinsicBlurCreate;
            allocation = allocationCreateFromBitmap;
            if (allocation != null) {
                try {
                    allocation.destroy();
                } catch (Exception unused5) {
                }
            }
            if (allocationCreateTyped != null) {
                try {
                    allocationCreateTyped.destroy();
                } catch (Exception unused6) {
                }
            }
            if (scriptIntrinsicBlur != null) {
                try {
                    scriptIntrinsicBlur.destroy();
                } catch (Exception unused7) {
                }
            }
            if (type == null) {
                throw th;
            }
            try {
                type.destroy();
                throw th;
            } catch (Exception unused8) {
                throw th;
            }
        }
    }
}
