package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import androidx.media3.common.ParserException;
import androidx.recyclerview.widget.RecyclerView;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.Reader;
import java.io.StringWriter;
import java.lang.reflect.Field;
import java.math.RoundingMode;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import kotlin.coroutines.Continuation;
import org.apache.http.HttpStatus;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class m6d {
    public static final o97 a = new o97("CRASH_REPORT", 1);
    public static final byte[] b = {112, 114, 111, 0};
    public static final byte[] c = {112, 114, 109, 0};

    public static void A(sra[] sraVarArr, Path path) {
        int i;
        int i2;
        char c2;
        int i3;
        int i4;
        sra sraVar;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        sra[] sraVarArr2 = sraVarArr;
        int i5 = 6;
        float[] fArr = new float[6];
        int length = sraVarArr2.length;
        int i6 = 0;
        char c3 = 'm';
        while (i6 < length) {
            sra sraVar2 = sraVarArr2[i6];
            char c4 = sraVar2.a;
            float f13 = fArr[0];
            float f14 = fArr[1];
            float f15 = fArr[2];
            float f16 = fArr[3];
            float f17 = fArr[4];
            float f18 = fArr[5];
            switch (c4) {
                case 'A':
                case 'a':
                    i = 7;
                    break;
                case 'C':
                case 'c':
                    i = i5;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i = 1;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i = 4;
                    break;
                case 'Z':
                case 'z':
                    path.close();
                    path.moveTo(f17, f18);
                    f13 = f17;
                    f15 = f13;
                    f14 = f18;
                    f16 = f14;
                default:
                    i = 2;
                    break;
            }
            float f19 = f17;
            float f20 = f18;
            float f21 = f13;
            float f22 = f14;
            int i7 = 0;
            while (true) {
                float[] fArr2 = sraVar2.b;
                if (i7 < fArr2.length) {
                    if (c4 != 'A') {
                        if (c4 != 'C') {
                            if (c4 == 'H') {
                                i2 = i7;
                                c2 = c4;
                                i3 = i6;
                                i4 = length;
                                sraVar = sraVar2;
                                path.lineTo(fArr2[i2], f22);
                                f21 = fArr2[i2];
                            } else if (c4 == 'Q') {
                                i2 = i7;
                                c2 = c4;
                                i3 = i6;
                                i4 = length;
                                sraVar = sraVar2;
                                float f23 = fArr2[i2];
                                int i8 = i2 + 1;
                                float f24 = fArr2[i8];
                                int i9 = i2 + 2;
                                int i10 = i2 + 3;
                                path.quadTo(f23, f24, fArr2[i9], fArr2[i10]);
                                f = fArr2[i2];
                                f2 = fArr2[i8];
                                f21 = fArr2[i9];
                                f22 = fArr2[i10];
                            } else if (c4 == 'V') {
                                i2 = i7;
                                c2 = c4;
                                i3 = i6;
                                i4 = length;
                                sraVar = sraVar2;
                                path.lineTo(f21, fArr2[i2]);
                                f22 = fArr2[i2];
                            } else if (c4 != 'a') {
                                if (c4 != 'c') {
                                    if (c4 != 'h') {
                                        if (c4 == 'q') {
                                            i2 = i7;
                                            float f25 = f22;
                                            float f26 = f21;
                                            int i11 = i2 + 1;
                                            int i12 = i2 + 2;
                                            int i13 = i2 + 3;
                                            path.rQuadTo(fArr2[i2], fArr2[i11], fArr2[i12], fArr2[i13]);
                                            float f27 = f26 + fArr2[i2];
                                            float f28 = fArr2[i11] + f25;
                                            float f29 = f26 + fArr2[i12];
                                            f22 = f25 + fArr2[i13];
                                            f16 = f28;
                                            f15 = f27;
                                            c2 = c4;
                                            i3 = i6;
                                            i4 = length;
                                            f21 = f29;
                                        } else if (c4 == 'v') {
                                            i2 = i7;
                                            path.rLineTo(0.0f, fArr2[i2]);
                                            f22 += fArr2[i2];
                                        } else if (c4 == 'L') {
                                            i2 = i7;
                                            int i14 = i2 + 1;
                                            path.lineTo(fArr2[i2], fArr2[i14]);
                                            f21 = fArr2[i2];
                                            f22 = fArr2[i14];
                                        } else if (c4 == 'M') {
                                            i2 = i7;
                                            f21 = fArr2[i2];
                                            f22 = fArr2[i2 + 1];
                                            if (i2 > 0) {
                                                path.lineTo(f21, f22);
                                            } else {
                                                path.moveTo(f21, f22);
                                                f20 = f22;
                                                f19 = f21;
                                            }
                                        } else if (c4 == 'S') {
                                            i2 = i7;
                                            float f30 = f22;
                                            float f31 = f21;
                                            if (c3 == 'c' || c3 == 's' || c3 == 'C' || c3 == 'S') {
                                                f7 = (f30 * 2.0f) - f16;
                                                f8 = (f31 * 2.0f) - f15;
                                            } else {
                                                f8 = f31;
                                                f7 = f30;
                                            }
                                            int i15 = i2 + 1;
                                            int i16 = i2 + 2;
                                            int i17 = i2 + 3;
                                            path.cubicTo(f8, f7, fArr2[i2], fArr2[i15], fArr2[i16], fArr2[i17]);
                                            float f32 = fArr2[i2];
                                            float f33 = fArr2[i15];
                                            f21 = fArr2[i16];
                                            f22 = fArr2[i17];
                                            f16 = f33;
                                            f15 = f32;
                                        } else if (c4 == 'T') {
                                            i2 = i7;
                                            float f34 = f22;
                                            float f35 = f21;
                                            if (c3 == 'q' || c3 == 't' || c3 == 'Q' || c3 == 'T') {
                                                f3 = (f35 * 2.0f) - f15;
                                                f4 = (f34 * 2.0f) - f16;
                                            } else {
                                                f3 = f35;
                                                f4 = f34;
                                            }
                                            int i18 = i2 + 1;
                                            path.quadTo(f3, f4, fArr2[i2], fArr2[i18]);
                                            f5 = fArr2[i2];
                                            f6 = fArr2[i18];
                                        } else if (c4 == 'l') {
                                            i2 = i7;
                                            int i19 = i2 + 1;
                                            path.rLineTo(fArr2[i2], fArr2[i19]);
                                            f21 += fArr2[i2];
                                            f22 += fArr2[i19];
                                        } else if (c4 == 'm') {
                                            i2 = i7;
                                            float f36 = fArr2[i2];
                                            f21 += f36;
                                            float f37 = fArr2[i2 + 1];
                                            f22 += f37;
                                            if (i2 > 0) {
                                                path.rLineTo(f36, f37);
                                            } else {
                                                path.rMoveTo(f36, f37);
                                                f20 = f22;
                                                f19 = f21;
                                            }
                                        } else if (c4 == 's') {
                                            if (c3 == 'c' || c3 == 's' || c3 == 'C' || c3 == 'S') {
                                                float f38 = f21 - f15;
                                                f9 = f22 - f16;
                                                f10 = f38;
                                            } else {
                                                f9 = 0.0f;
                                                f10 = 0.0f;
                                            }
                                            int i20 = i7 + 1;
                                            int i21 = i7 + 2;
                                            int i22 = i7 + 3;
                                            i2 = i7;
                                            float f39 = f22;
                                            float f40 = f21;
                                            path.rCubicTo(f10, f9, fArr2[i7], fArr2[i20], fArr2[i21], fArr2[i22]);
                                            f3 = f40 + fArr2[i2];
                                            f4 = f39 + fArr2[i20];
                                            f5 = f40 + fArr2[i21];
                                            f6 = fArr2[i22] + f39;
                                        } else if (c4 != 't') {
                                            i2 = i7;
                                        } else {
                                            if (c3 == 'q' || c3 == 't' || c3 == 'Q' || c3 == 'T') {
                                                f11 = f21 - f15;
                                                f12 = f22 - f16;
                                            } else {
                                                f12 = 0.0f;
                                                f11 = 0.0f;
                                            }
                                            int i23 = i7 + 1;
                                            path.rQuadTo(f11, f12, fArr2[i7], fArr2[i23]);
                                            float f41 = f11 + f21;
                                            float f42 = f12 + f22;
                                            f21 += fArr2[i7];
                                            f22 += fArr2[i23];
                                            f16 = f42;
                                            i2 = i7;
                                            c2 = c4;
                                            i3 = i6;
                                            i4 = length;
                                            f15 = f41;
                                        }
                                        sraVar = sraVar2;
                                    } else {
                                        i2 = i7;
                                        path.rLineTo(fArr2[i2], 0.0f);
                                        f21 += fArr2[i2];
                                    }
                                    c2 = c4;
                                    i3 = i6;
                                    i4 = length;
                                    sraVar = sraVar2;
                                } else {
                                    i2 = i7;
                                    float f43 = f22;
                                    float f44 = f21;
                                    int i24 = i2 + 2;
                                    int i25 = i2 + 3;
                                    int i26 = i2 + 4;
                                    int i27 = i2 + 5;
                                    path.rCubicTo(fArr2[i2], fArr2[i2 + 1], fArr2[i24], fArr2[i25], fArr2[i26], fArr2[i27]);
                                    f3 = f44 + fArr2[i24];
                                    f4 = f43 + fArr2[i25];
                                    f5 = f44 + fArr2[i26];
                                    f6 = fArr2[i27] + f43;
                                }
                                f16 = f4;
                                f15 = f3;
                                c2 = c4;
                                i3 = i6;
                                i4 = length;
                                f21 = f5;
                                f22 = f6;
                                sraVar = sraVar2;
                            } else {
                                i2 = i7;
                                float f45 = f22;
                                float f46 = f21;
                                int i28 = i2 + 5;
                                int i29 = i2 + 6;
                                c2 = c4;
                                i4 = length;
                                sraVar = sraVar2;
                                i3 = i6;
                                sra.a(path, f46, f45, fArr2[i28] + f46, fArr2[i29] + f45, fArr2[i2], fArr2[i2 + 1], fArr2[i2 + 2], fArr2[i2 + 3] != 0.0f, fArr2[i2 + 4] != 0.0f);
                                f21 = f46 + fArr2[i28];
                                f22 = f45 + fArr2[i29];
                            }
                            i7 = i2 + i;
                            sraVar2 = sraVar;
                            length = i4;
                            c3 = c2;
                            c4 = c3;
                            i6 = i3;
                        } else {
                            i2 = i7;
                            c2 = c4;
                            i3 = i6;
                            i4 = length;
                            sraVar = sraVar2;
                            int i30 = i2 + 2;
                            int i31 = i2 + 3;
                            int i32 = i2 + 4;
                            int i33 = i2 + 5;
                            path.cubicTo(fArr2[i2], fArr2[i2 + 1], fArr2[i30], fArr2[i31], fArr2[i32], fArr2[i33]);
                            f21 = fArr2[i32];
                            f22 = fArr2[i33];
                            f = fArr2[i30];
                            f2 = fArr2[i31];
                        }
                        f15 = f;
                        f16 = f2;
                        i7 = i2 + i;
                        sraVar2 = sraVar;
                        length = i4;
                        c3 = c2;
                        c4 = c3;
                        i6 = i3;
                    } else {
                        i2 = i7;
                        c2 = c4;
                        i3 = i6;
                        i4 = length;
                        sraVar = sraVar2;
                        int i34 = i2 + 5;
                        int i35 = i2 + 6;
                        sra.a(path, f21, f22, fArr2[i34], fArr2[i35], fArr2[i2], fArr2[i2 + 1], fArr2[i2 + 2], fArr2[i2 + 3] != 0.0f, fArr2[i2 + 4] != 0.0f);
                        f21 = fArr2[i34];
                        f22 = fArr2[i35];
                    }
                    f16 = f22;
                    f15 = f21;
                    i7 = i2 + i;
                    sraVar2 = sraVar;
                    length = i4;
                    c3 = c2;
                    c4 = c3;
                    i6 = i3;
                }
            }
            fArr[0] = f21;
            fArr[1] = f22;
            fArr[2] = f15;
            fArr[3] = f16;
            fArr[4] = f19;
            fArr[5] = f20;
            c3 = sraVar2.a;
            i6++;
            sraVarArr2 = sraVarArr;
            length = length;
            i5 = 6;
        }
    }

    public static f99 B(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = (String) list.get(i);
            int i2 = oaf.a;
            String[] strArrSplit = str.split("=", 2);
            if (strArrSplit.length != 2) {
                z04.c0("Failed to parse Vorbis comment: ".concat(str));
            } else if (strArrSplit[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(sza.a(new wpa(Base64.decode(strArrSplit[1], 0))));
                } catch (RuntimeException e) {
                    z04.d0("Failed to parse vorbis picture", e);
                }
            } else {
                arrayList.add(new wqf(strArrSplit[0], strArrSplit[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new f99(arrayList);
    }

    public static int[] C(ByteArrayInputStream byteArrayInputStream, int i) {
        int[] iArr = new int[i];
        int iZ = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iZ += (int) i24.z(byteArrayInputStream, 2);
            iArr[i2] = iZ;
        }
        return iArr;
    }

    public static bj4[] D(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, bj4[] bj4VarArr) throws IOException {
        byte[] bArr3 = oag.g;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, oag.h)) {
                throw new IllegalStateException("Unsupported meta version");
            }
            int iZ = (int) i24.z(fileInputStream, 2);
            byte[] bArrY = i24.y(fileInputStream, (int) i24.z(fileInputStream, 4), (int) i24.z(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                throw new IllegalStateException("Content found after the end of file");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrY);
            try {
                bj4[] bj4VarArrF = F(byteArrayInputStream, bArr2, iZ, bj4VarArr);
                byteArrayInputStream.close();
                return bj4VarArrF;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(oag.b, bArr2)) {
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        }
        if (!Arrays.equals(bArr, bArr3)) {
            throw new IllegalStateException("Unsupported meta version");
        }
        int iZ2 = (int) i24.z(fileInputStream, 1);
        byte[] bArrY2 = i24.y(fileInputStream, (int) i24.z(fileInputStream, 4), (int) i24.z(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArrY2);
        try {
            bj4[] bj4VarArrE = E(byteArrayInputStream2, iZ2, bj4VarArr);
            byteArrayInputStream2.close();
            return bj4VarArrE;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static bj4[] E(ByteArrayInputStream byteArrayInputStream, int i, bj4[] bj4VarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new bj4[0];
        }
        if (i != bj4VarArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i];
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            int iZ = (int) i24.z(byteArrayInputStream, 2);
            iArr[i2] = (int) i24.z(byteArrayInputStream, 2);
            strArr[i2] = new String(i24.x(byteArrayInputStream, iZ), StandardCharsets.UTF_8);
        }
        for (int i3 = 0; i3 < i; i3++) {
            bj4 bj4Var = bj4VarArr[i3];
            if (!bj4Var.b.equals(strArr[i3])) {
                throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
            }
            int i4 = iArr[i3];
            bj4Var.e = i4;
            bj4Var.h = C(byteArrayInputStream, i4);
        }
        return bj4VarArr;
    }

    public static bj4[] F(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i, bj4[] bj4VarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new bj4[0];
        }
        if (i != bj4VarArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        for (int i2 = 0; i2 < i; i2++) {
            i24.z(byteArrayInputStream, 2);
            String str = new String(i24.x(byteArrayInputStream, (int) i24.z(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long jZ = i24.z(byteArrayInputStream, 4);
            int iZ = (int) i24.z(byteArrayInputStream, 2);
            bj4 bj4Var = null;
            if (bj4VarArr.length > 0) {
                int iIndexOf = str.indexOf("!");
                if (iIndexOf < 0) {
                    iIndexOf = str.indexOf(":");
                }
                String strSubstring = iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
                int i3 = 0;
                while (true) {
                    if (i3 >= bj4VarArr.length) {
                        break;
                    }
                    if (bj4VarArr[i3].b.equals(strSubstring)) {
                        bj4Var = bj4VarArr[i3];
                        break;
                    }
                    i3++;
                }
            }
            if (bj4Var == null) {
                throw new IllegalStateException("Missing profile key: ".concat(str));
            }
            bj4Var.d = jZ;
            int[] iArrC = C(byteArrayInputStream, iZ);
            if (Arrays.equals(bArr, oag.f)) {
                bj4Var.e = iZ;
                bj4Var.h = iArrC;
            }
        }
        return bj4VarArr;
    }

    public static bj4[] G(FileInputStream fileInputStream, byte[] bArr, String str) throws IOException {
        if (!Arrays.equals(bArr, oag.c)) {
            throw new IllegalStateException("Unsupported version");
        }
        int iZ = (int) i24.z(fileInputStream, 1);
        byte[] bArrY = i24.y(fileInputStream, (int) i24.z(fileInputStream, 4), (int) i24.z(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrY);
        try {
            bj4[] bj4VarArrI = I(byteArrayInputStream, str, iZ);
            byteArrayInputStream.close();
            return bj4VarArrI;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static final String H(Reader reader) throws IOException {
        StringWriter stringWriter = new StringWriter();
        char[] cArr = new char[8192];
        int i = reader.read(cArr);
        while (i >= 0) {
            stringWriter.write(cArr, 0, i);
            i = reader.read(cArr);
        }
        return stringWriter.toString();
    }

    public static bj4[] I(ByteArrayInputStream byteArrayInputStream, String str, int i) throws IOException {
        TreeMap treeMap;
        if (byteArrayInputStream.available() == 0) {
            return new bj4[0];
        }
        bj4[] bj4VarArr = new bj4[i];
        for (int i2 = 0; i2 < i; i2++) {
            int iZ = (int) i24.z(byteArrayInputStream, 2);
            int iZ2 = (int) i24.z(byteArrayInputStream, 2);
            bj4VarArr[i2] = new bj4(str, new String(i24.x(byteArrayInputStream, iZ), StandardCharsets.UTF_8), i24.z(byteArrayInputStream, 4), iZ2, (int) i24.z(byteArrayInputStream, 4), (int) i24.z(byteArrayInputStream, 4), new int[iZ2], new TreeMap());
        }
        for (int i3 = 0; i3 < i; i3++) {
            bj4 bj4Var = bj4VarArr[i3];
            int iAvailable = byteArrayInputStream.available() - bj4Var.f;
            int iZ3 = 0;
            while (true) {
                int iAvailable2 = byteArrayInputStream.available();
                treeMap = bj4Var.i;
                if (iAvailable2 <= iAvailable) {
                    break;
                }
                iZ3 += (int) i24.z(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(iZ3), 1);
                for (int iZ4 = (int) i24.z(byteArrayInputStream, 2); iZ4 > 0; iZ4--) {
                    i24.z(byteArrayInputStream, 2);
                    int iZ5 = (int) i24.z(byteArrayInputStream, 1);
                    if (iZ5 != 6 && iZ5 != 7) {
                        while (iZ5 > 0) {
                            i24.z(byteArrayInputStream, 1);
                            for (int iZ6 = (int) i24.z(byteArrayInputStream, 1); iZ6 > 0; iZ6--) {
                                i24.z(byteArrayInputStream, 2);
                            }
                            iZ5--;
                        }
                    }
                }
            }
            if (byteArrayInputStream.available() != iAvailable) {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
            bj4Var.h = C(byteArrayInputStream, bj4Var.e);
            int i4 = bj4Var.g;
            BitSet bitSetValueOf = BitSet.valueOf(i24.x(byteArrayInputStream, (((i4 * 2) + 7) & (-8)) / 8));
            for (int i5 = 0; i5 < i4; i5++) {
                int i6 = bitSetValueOf.get(i5) ? 2 : 0;
                if (bitSetValueOf.get(i5 + i4)) {
                    i6 |= 4;
                }
                if (i6 != 0) {
                    Integer num = (Integer) treeMap.get(Integer.valueOf(i5));
                    if (num == null) {
                        num = 0;
                    }
                    treeMap.put(Integer.valueOf(i5), Integer.valueOf(i6 | num.intValue()));
                }
            }
        }
        return bj4VarArr;
    }

    public static mfe J(wpa wpaVar, boolean z, boolean z2) throws ParserException {
        if (z) {
            T(3, wpaVar, false);
        }
        wpaVar.s((int) wpaVar.l(), b52.c);
        long jL = wpaVar.l();
        String[] strArr = new String[(int) jL];
        for (int i = 0; i < jL; i++) {
            strArr[i] = wpaVar.s((int) wpaVar.l(), b52.c);
        }
        if (z2 && (wpaVar.u() & 1) == 0) {
            throw ParserException.a(null, "framing bit expected to be set");
        }
        return new mfe(strArr);
    }

    public static final void K(File file, File file2) throws IOException {
        if (file.renameTo(file2)) {
            return;
        }
        throw new IOException("Can't rename " + file + " to " + file2);
    }

    public static long L(long j, long j2) {
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(~j2) + Long.numberOfLeadingZeros(j2) + Long.numberOfLeadingZeros(~j) + Long.numberOfLeadingZeros(j);
        if (iNumberOfLeadingZeros > 65) {
            return j * j2;
        }
        long j3 = ((j ^ j2) >>> 63) + Long.MAX_VALUE;
        if ((iNumberOfLeadingZeros < 64) || ((j2 == Long.MIN_VALUE) & (j < 0))) {
            return j3;
        }
        long j4 = j * j2;
        return (j == 0 || j4 / j == j2) ? j4 : j3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void M(Drawable drawable, Drawable.Callback callback, b1f b1fVar) {
        if (drawable == 0) {
            return;
        }
        drawable.setCallback(callback);
        a1f a1fVar = drawable instanceof a1f ? (a1f) drawable : null;
        if (a1fVar != null) {
            a1fVar.l(b1fVar);
        }
    }

    public static boolean N(Intent intent) {
        Bundle extras;
        if (intent == null || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction()) || (extras = intent.getExtras()) == null) {
            return false;
        }
        return "1".equals(extras.getString("google.c.a.e"));
    }

    public static final mqc O(mn5 mn5Var, long j) {
        mec mecVar = new mec();
        y77 y77VarA = pag.a();
        y77VarA.H();
        mecVar.a = y77VarA;
        return new mqc(new o0e(new cp5(mn5Var, new br(mecVar, (Continuation) null, 15)), mecVar, j, null));
    }

    public static final JSONArray P(List list) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        for (Object objQ : list) {
            if (objQ instanceof List) {
                objQ = P((List) objQ);
            } else if (objQ instanceof Map) {
                objQ = Q((Map) objQ);
            }
            jSONArray.put(objQ);
        }
        return jSONArray;
    }

    public static final JSONObject Q(Map map) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof List) {
                value = P((List) value);
            } else if (value instanceof Map) {
                value = Q((Map) value);
            }
            jSONObject.putOpt(String.valueOf(key), value);
        }
        return jSONObject;
    }

    /* JADX WARN: Finally extract failed */
    public static boolean R(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, bj4[] bj4VarArr) throws IOException {
        long j;
        ArrayList arrayList;
        int length;
        byte[] bArr2 = oag.b;
        int i = 0;
        if (!Arrays.equals(bArr, bArr2)) {
            byte[] bArr3 = oag.c;
            if (Arrays.equals(bArr, bArr3)) {
                byte[] bArrG = g(bj4VarArr, bArr3);
                i24.J(byteArrayOutputStream, bj4VarArr.length, 1);
                i24.J(byteArrayOutputStream, bArrG.length, 4);
                byte[] bArrI = i24.i(bArrG);
                i24.J(byteArrayOutputStream, bArrI.length, 4);
                byteArrayOutputStream.write(bArrI);
                return true;
            }
            byte[] bArr4 = oag.e;
            if (Arrays.equals(bArr, bArr4)) {
                i24.J(byteArrayOutputStream, bj4VarArr.length, 1);
                for (bj4 bj4Var : bj4VarArr) {
                    int size = bj4Var.i.size() * 4;
                    String strP = p(bj4Var.a, bj4Var.b, bArr4);
                    Charset charset = StandardCharsets.UTF_8;
                    i24.K(strP.getBytes(charset).length, byteArrayOutputStream);
                    i24.K(bj4Var.h.length, byteArrayOutputStream);
                    i24.J(byteArrayOutputStream, size, 4);
                    i24.J(byteArrayOutputStream, bj4Var.c, 4);
                    byteArrayOutputStream.write(strP.getBytes(charset));
                    Iterator it = bj4Var.i.keySet().iterator();
                    while (it.hasNext()) {
                        i24.K(((Integer) it.next()).intValue(), byteArrayOutputStream);
                        i24.K(0, byteArrayOutputStream);
                    }
                    for (int i2 : bj4Var.h) {
                        i24.K(i2, byteArrayOutputStream);
                    }
                }
                return true;
            }
            byte[] bArr5 = oag.d;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] bArrG2 = g(bj4VarArr, bArr5);
                i24.J(byteArrayOutputStream, bj4VarArr.length, 1);
                i24.J(byteArrayOutputStream, bArrG2.length, 4);
                byte[] bArrI2 = i24.i(bArrG2);
                i24.J(byteArrayOutputStream, bArrI2.length, 4);
                byteArrayOutputStream.write(bArrI2);
                return true;
            }
            byte[] bArr6 = oag.f;
            if (!Arrays.equals(bArr, bArr6)) {
                return false;
            }
            i24.K(bj4VarArr.length, byteArrayOutputStream);
            for (bj4 bj4Var2 : bj4VarArr) {
                String strP2 = p(bj4Var2.a, bj4Var2.b, bArr6);
                Charset charset2 = StandardCharsets.UTF_8;
                i24.K(strP2.getBytes(charset2).length, byteArrayOutputStream);
                TreeMap treeMap = bj4Var2.i;
                i24.K(treeMap.size(), byteArrayOutputStream);
                i24.K(bj4Var2.h.length, byteArrayOutputStream);
                i24.J(byteArrayOutputStream, bj4Var2.c, 4);
                byteArrayOutputStream.write(strP2.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    i24.K(((Integer) it2.next()).intValue(), byteArrayOutputStream);
                }
                for (int i3 : bj4Var2.h) {
                    i24.K(i3, byteArrayOutputStream);
                }
            }
            return true;
        }
        ArrayList arrayList2 = new ArrayList(3);
        ArrayList arrayList3 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            i24.K(bj4VarArr.length, byteArrayOutputStream2);
            int i4 = 2;
            int i5 = 2;
            for (bj4 bj4Var3 : bj4VarArr) {
                i24.J(byteArrayOutputStream2, bj4Var3.c, 4);
                i24.J(byteArrayOutputStream2, bj4Var3.d, 4);
                i24.J(byteArrayOutputStream2, bj4Var3.g, 4);
                String strP3 = p(bj4Var3.a, bj4Var3.b, bArr2);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = strP3.getBytes(charset3).length;
                i24.K(length2, byteArrayOutputStream2);
                i5 = i5 + 14 + length2;
                byteArrayOutputStream2.write(strP3.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i5 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i5 + ", does not match actual size " + byteArray.length);
            }
            e9g e9gVar = new e9g(1, byteArray, false);
            byteArrayOutputStream2.close();
            arrayList2.add(e9gVar);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i6 = 0;
            int i7 = 0;
            while (i6 < bj4VarArr.length) {
                try {
                    bj4 bj4Var4 = bj4VarArr[i6];
                    i24.K(i6, byteArrayOutputStream3);
                    i24.K(bj4Var4.e, byteArrayOutputStream3);
                    i7 = i7 + 4 + (bj4Var4.e * 2);
                    int[] iArr = bj4Var4.h;
                    int length3 = iArr.length;
                    int i8 = i;
                    while (i < length3) {
                        int i9 = iArr[i];
                        i24.K(i9 - i8, byteArrayOutputStream3);
                        i++;
                        i8 = i9;
                    }
                    i6++;
                    i = 0;
                } catch (Throwable th) {
                }
            }
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i7 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i7 + ", does not match actual size " + byteArray2.length);
            }
            e9g e9gVar2 = new e9g(3, byteArray2, true);
            byteArrayOutputStream3.close();
            arrayList2.add(e9gVar2);
            byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i10 = 0;
            int i11 = 0;
            while (i10 < bj4VarArr.length) {
                try {
                    bj4 bj4Var5 = bj4VarArr[i10];
                    Iterator it3 = bj4Var5.i.entrySet().iterator();
                    int iIntValue = 0;
                    while (it3.hasNext()) {
                        iIntValue |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                    try {
                        V(byteArrayOutputStream4, bj4Var5);
                        byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                        byteArrayOutputStream4.close();
                        byteArrayOutputStream4 = new ByteArrayOutputStream();
                        try {
                            W(byteArrayOutputStream4, bj4Var5);
                            byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                            byteArrayOutputStream4.close();
                            i24.K(i10, byteArrayOutputStream3);
                            int length4 = byteArray3.length + i4 + byteArray4.length;
                            int i12 = i11 + 6;
                            ArrayList arrayList4 = arrayList3;
                            i24.J(byteArrayOutputStream3, length4, 4);
                            i24.K(iIntValue, byteArrayOutputStream3);
                            byteArrayOutputStream3.write(byteArray3);
                            byteArrayOutputStream3.write(byteArray4);
                            i11 = i12 + length4;
                            i10++;
                            arrayList3 = arrayList4;
                            i4 = 2;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                    try {
                        byteArrayOutputStream3.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
            }
            ArrayList arrayList5 = arrayList3;
            byte[] byteArray5 = byteArrayOutputStream3.toByteArray();
            if (i11 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i11 + ", does not match actual size " + byteArray5.length);
            }
            e9g e9gVar3 = new e9g(4, byteArray5, true);
            byteArrayOutputStream3.close();
            arrayList2.add(e9gVar3);
            long j2 = 4;
            long size2 = j2 + j2 + 4 + (arrayList2.size() * 16);
            i24.J(byteArrayOutputStream, arrayList2.size(), 4);
            int i13 = 0;
            while (i13 < arrayList2.size()) {
                e9g e9gVar4 = (e9g) arrayList2.get(i13);
                int i14 = e9gVar4.a;
                if (i14 == 1) {
                    j = 0;
                } else if (i14 == 2) {
                    j = 1;
                } else if (i14 == 3) {
                    j = 2;
                } else if (i14 == 4) {
                    j = 3;
                } else {
                    if (i14 != 5) {
                        throw null;
                    }
                    j = 4;
                }
                i24.J(byteArrayOutputStream, j, 4);
                i24.J(byteArrayOutputStream, size2, 4);
                boolean z = e9gVar4.c;
                byte[] bArr7 = e9gVar4.b;
                if (z) {
                    long length5 = bArr7.length;
                    byte[] bArrI3 = i24.i(bArr7);
                    arrayList = arrayList5;
                    arrayList.add(bArrI3);
                    i24.J(byteArrayOutputStream, bArrI3.length, 4);
                    i24.J(byteArrayOutputStream, length5, 4);
                    length = bArrI3.length;
                } else {
                    arrayList = arrayList5;
                    arrayList.add(bArr7);
                    i24.J(byteArrayOutputStream, bArr7.length, 4);
                    i24.J(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += length;
                i13++;
                arrayList5 = arrayList;
            }
            ArrayList arrayList6 = arrayList5;
            for (int i15 = 0; i15 < arrayList6.size(); i15++) {
                byteArrayOutputStream.write((byte[]) arrayList6.get(i15));
            }
            return true;
        } catch (Throwable th3) {
            try {
                byteArrayOutputStream2.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    public static final void S(y5f y5fVar) {
        y5fVar.e(jx8.class, new uza(9));
        y5fVar.e(l6c.class, new uza(10));
    }

    public static boolean T(int i, wpa wpaVar, boolean z) throws ParserException {
        if (wpaVar.a() < 7) {
            if (z) {
                return false;
            }
            throw ParserException.a(null, "too short header: " + wpaVar.a());
        }
        if (wpaVar.u() != i) {
            if (z) {
                return false;
            }
            throw ParserException.a(null, "expected header type " + Integer.toHexString(i));
        }
        if (wpaVar.u() == 118 && wpaVar.u() == 111 && wpaVar.u() == 114 && wpaVar.u() == 98 && wpaVar.u() == 105 && wpaVar.u() == 115) {
            return true;
        }
        if (z) {
            return false;
        }
        throw ParserException.a(null, "expected characters 'vorbis'");
    }

    public static void U(ByteArrayOutputStream byteArrayOutputStream, bj4 bj4Var, String str) throws IOException {
        Charset charset = StandardCharsets.UTF_8;
        i24.K(str.getBytes(charset).length, byteArrayOutputStream);
        i24.K(bj4Var.e, byteArrayOutputStream);
        i24.J(byteArrayOutputStream, bj4Var.f, 4);
        i24.J(byteArrayOutputStream, bj4Var.c, 4);
        i24.J(byteArrayOutputStream, bj4Var.g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void V(ByteArrayOutputStream byteArrayOutputStream, bj4 bj4Var) throws IOException {
        byte[] bArr = new byte[(((bj4Var.g * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : bj4Var.i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            if ((iIntValue2 & 2) != 0) {
                int i = iIntValue / 8;
                bArr[i] = (byte) (bArr[i] | (1 << (iIntValue % 8)));
            }
            if ((iIntValue2 & 4) != 0) {
                int i2 = iIntValue + bj4Var.g;
                int i3 = i2 / 8;
                bArr[i3] = (byte) ((1 << (i2 % 8)) | bArr[i3]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void W(ByteArrayOutputStream byteArrayOutputStream, bj4 bj4Var) {
        int i = 0;
        for (Map.Entry entry : bj4Var.i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                i24.K(iIntValue - i, byteArrayOutputStream);
                i24.K(0, byteArrayOutputStream);
                i = iIntValue;
            }
        }
    }

    public static boolean a(sra[] sraVarArr, sra[] sraVarArr2) {
        if (sraVarArr == null || sraVarArr2 == null || sraVarArr.length != sraVarArr2.length) {
            return false;
        }
        for (int i = 0; i < sraVarArr.length; i++) {
            sra sraVar = sraVarArr[i];
            char c2 = sraVar.a;
            sra sraVar2 = sraVarArr2[i];
            if (c2 != sraVar2.a || sraVar.b.length != sraVar2.b.length) {
                return false;
            }
        }
        return true;
    }

    public static long b(long j, long j2) {
        long j3 = j + j2;
        if (((j ^ j2) < 0) || ((j ^ j3) >= 0)) {
            return j3;
        }
        throw new ArithmeticException(zr6.k(au1.k(j, "overflow: checkedAdd(", ", "), j2, ")"));
    }

    public static final void c(AutoCloseable autoCloseable, Throwable th) throws Exception {
        if (autoCloseable != null) {
            if (th == null) {
                autoCloseable.close();
                return;
            }
            try {
                autoCloseable.close();
            } catch (Throwable th2) {
                j47.e(th, th2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r1v1, types: [njc] */
    public static void d(View view, fka fkaVar) {
        CharSequence text;
        c6d njcVar;
        int itemDecorationCount;
        int i = 2;
        int i2 = 0;
        int i3 = 1;
        c6d c6dVar = vz4.a;
        if (view instanceof kre) {
            ((kre) view).onThemeChanged(fkaVar);
            return;
        }
        if (!(view instanceof RecyclerView)) {
            if (!(view instanceof TextView) || (text = ((TextView) view).getText()) == null) {
                return;
            }
            xfg.c(text, fkaVar);
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        int itemDecorationCount2 = recyclerView.getItemDecorationCount();
        int i4 = 0;
        boolean z = false;
        while (true) {
            Collection linkedHashSet = null;
            if (i4 >= itemDecorationCount2) {
                if (z) {
                    recyclerView.Y();
                }
                try {
                    Field declaredField = RecyclerView.class.getDeclaredField("c");
                    declaredField.setAccessible(true);
                    vdc vdcVar = (vdc) declaredField.get(recyclerView);
                    Field declaredField2 = vdc.class.getDeclaredField("a");
                    declaredField2.setAccessible(true);
                    Object obj = declaredField2.get(vdcVar);
                    List list = obj instanceof List ? (List) obj : null;
                    List list2 = nz4.a;
                    if (list == null) {
                        list = list2;
                    }
                    Field declaredField3 = vdc.class.getDeclaredField("c");
                    declaredField3.setAccessible(true);
                    Object obj2 = declaredField3.get(vdcVar);
                    List list3 = obj2 instanceof List ? (List) obj2 : null;
                    if (list3 != null) {
                        list2 = list3;
                    }
                    hdc adapter = recyclerView.getAdapter();
                    if (adapter != null) {
                        j37 j37VarY = ote.Y(0, adapter.j());
                        linkedHashSet = new LinkedHashSet();
                        Iterator it = j37VarY.iterator();
                        while (((i37) it).c) {
                            linkedHashSet.add(Integer.valueOf(adapter.l(((i37) it).a())));
                        }
                    }
                    if (linkedHashSet == null) {
                        linkedHashSet = wz4.a;
                    }
                    ArrayList arrayList = new ArrayList();
                    Iterator it2 = linkedHashSet.iterator();
                    while (it2.hasNext()) {
                        int iIntValue = ((Number) it2.next()).intValue();
                        dec recycledView = recyclerView.getRecycledViewPool().getRecycledView(iIntValue);
                        d63.W(arrayList, recycledView == null ? c6dVar : new km4(new ie(6, recycledView), i3, new m8(iIntValue, i2, recyclerView)));
                    }
                    njcVar = new r1f(l6d.d0(ys.Q(new c6d[]{l6d.d0(ys.Q(new List[]{list, list2}), n71.t0), new at(i, arrayList)}), n71.s0), new k8(i3));
                } catch (Throwable th) {
                    njcVar = new njc(th);
                }
                if (!(njcVar instanceof njc)) {
                    c6dVar = njcVar;
                }
                l6d.X(l6d.f0(v3c.F(c6dVar, new k8(i2), new l8(i2, fkaVar)), new l8(i3, fkaVar)));
                return;
            }
            itemDecorationCount = recyclerView.getItemDecorationCount();
            if (i4 < 0 || i4 >= itemDecorationCount) {
                break;
            }
            Object obj3 = (ndc) recyclerView.D0.get(i4);
            kre kreVar = obj3 instanceof kre ? (kre) obj3 : null;
            if (kreVar != null) {
                kreVar.onThemeChanged(fkaVar);
                z = true;
            }
            i4++;
            z = z;
        }
        throw new IndexOutOfBoundsException(i4 + " is an invalid index for size " + itemDecorationCount);
    }

    public static float[] e(int i, float[] fArr) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (length < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int iMin = Math.min(i, length);
        float[] fArr2 = new float[i];
        System.arraycopy(fArr, 0, fArr2, 0, iMin);
        return fArr2;
    }

    public static final void f(Drawable drawable, Drawable drawable2) {
        if (drawable2 == null || drawable == null || drawable == drawable2) {
            return;
        }
        drawable.setBounds(drawable2.getBounds());
        drawable.setChangingConfigurations(drawable2.getChangingConfigurations());
        drawable.setLevel(drawable2.getLevel());
        drawable.setVisible(drawable2.isVisible(), false);
        drawable.setState(drawable2.getState());
    }

    public static byte[] g(bj4[] bj4VarArr, byte[] bArr) throws IOException {
        int length = 0;
        for (bj4 bj4Var : bj4VarArr) {
            length += ((((bj4Var.g * 2) + 7) & (-8)) / 8) + (bj4Var.e * 2) + p(bj4Var.a, bj4Var.b, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + bj4Var.f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        if (Arrays.equals(bArr, oag.d)) {
            for (bj4 bj4Var2 : bj4VarArr) {
                U(byteArrayOutputStream, bj4Var2, p(bj4Var2.a, bj4Var2.b, bArr));
                W(byteArrayOutputStream, bj4Var2);
                int[] iArr = bj4Var2.h;
                int length2 = iArr.length;
                int i = 0;
                int i2 = 0;
                while (i < length2) {
                    int i3 = iArr[i];
                    i24.K(i3 - i2, byteArrayOutputStream);
                    i++;
                    i2 = i3;
                }
                V(byteArrayOutputStream, bj4Var2);
            }
        } else {
            for (bj4 bj4Var3 : bj4VarArr) {
                U(byteArrayOutputStream, bj4Var3, p(bj4Var3.a, bj4Var3.b, bArr));
            }
            for (bj4 bj4Var4 : bj4VarArr) {
                W(byteArrayOutputStream, bj4Var4);
                int[] iArr2 = bj4Var4.h;
                int length3 = iArr2.length;
                int i4 = 0;
                int i5 = 0;
                while (i4 < length3) {
                    int i6 = iArr2[i4];
                    i24.K(i6 - i5, byteArrayOutputStream);
                    i4++;
                    i5 = i6;
                }
                V(byteArrayOutputStream, bj4Var4);
            }
        }
        if (byteArrayOutputStream.size() == length) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + length);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0096 A[Catch: NumberFormatException -> 0x00aa, LOOP:3: B:25:0x0068->B:44:0x0096, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:68:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009c A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:68:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b1 A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:68:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0095 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.sra[] h(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m6d.h(java.lang.String):sra[]");
    }

    public static Path i(String str) {
        Path path = new Path();
        try {
            A(h(str), path);
            return path;
        } catch (RuntimeException e) {
            throw new RuntimeException("Error in parsing ".concat(str), e);
        }
    }

    public static sra[] j(sra[] sraVarArr) {
        sra[] sraVarArr2 = new sra[sraVarArr.length];
        for (int i = 0; i < sraVarArr.length; i++) {
            sraVarArr2[i] = new sra(sraVarArr[i]);
        }
        return sraVarArr2;
    }

    public static final void k(File file) throws IOException {
        if (!file.exists() || lk5.F(file)) {
            return;
        }
        throw new IOException("Can't delete " + file);
    }

    public static boolean l() {
        Context context;
        SharedPreferences sharedPreferences;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            fl5.b();
            fl5 fl5VarB = fl5.b();
            fl5VarB.a();
            context = fl5VarB.a;
            sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
        } catch (PackageManager.NameNotFoundException | IllegalStateException unused) {
        }
        if (sharedPreferences.contains("export_to_big_query")) {
            return sharedPreferences.getBoolean("export_to_big_query", false);
        }
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("delivery_metrics_exported_to_big_query_enabled")) {
            return applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
        }
        return false;
    }

    public static long m(long j, long j2, RoundingMode roundingMode) {
        roundingMode.getClass();
        long j3 = j / j2;
        long j4 = j - (j2 * j3);
        if (j4 == 0) {
            return j3;
        }
        int i = ((int) ((j ^ j2) >> 63)) | 1;
        switch (pv7.a[roundingMode.ordinal()]) {
            case 1:
                if (j4 == 0) {
                    return j3;
                }
                throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
            case 2:
                return j3;
            case 3:
                if (i >= 0) {
                    return j3;
                }
                break;
            case 4:
                break;
            case 5:
                if (i <= 0) {
                    return j3;
                }
                break;
            case 6:
            case 7:
            case 8:
                long jAbs = Math.abs(j4);
                long jAbs2 = jAbs - (Math.abs(j2) - jAbs);
                if (jAbs2 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP && (roundingMode != RoundingMode.HALF_EVEN || (1 & j3) == 0)) {
                        return j3;
                    }
                } else if (jAbs2 <= 0) {
                    return j3;
                }
                break;
            default:
                throw new AssertionError();
        }
        return j3 + i;
    }

    public static Map n(qqd qqdVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator itG = qqdVar.G();
        while (itG.hasNext()) {
            Object objY = qqdVar.y(itG.next());
            Object kecVar = linkedHashMap.get(objY);
            if (kecVar == null && !linkedHashMap.containsKey(objY)) {
                kecVar = new kec();
            }
            kec kecVar2 = (kec) kecVar;
            kecVar2.a++;
            linkedHashMap.put(objY, kecVar2);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if ((entry instanceof qb7) && !(entry instanceof tb7)) {
                f8.A(entry, "kotlin.collections.MutableMap.MutableEntry");
                throw null;
            }
            entry.setValue(Integer.valueOf(((kec) entry.getValue()).a));
        }
        f8.b(linkedHashMap);
        return linkedHashMap;
    }

    public static long o(long j, long j2) {
        od2.n(j, "a");
        od2.n(j2, "b");
        if (j == 0) {
            return j2;
        }
        if (j2 == 0) {
            return j;
        }
        int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j);
        long jNumberOfTrailingZeros = j >> iNumberOfTrailingZeros;
        int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(j2);
        long j3 = j2 >> iNumberOfTrailingZeros2;
        while (jNumberOfTrailingZeros != j3) {
            long j4 = jNumberOfTrailingZeros - j3;
            long j5 = (j4 >> 63) & j4;
            long j6 = (j4 - j5) - j5;
            j3 += j5;
            jNumberOfTrailingZeros = j6 >> Long.numberOfTrailingZeros(j6);
        }
        return jNumberOfTrailingZeros << Math.min(iNumberOfTrailingZeros, iNumberOfTrailingZeros2);
    }

    public static String p(String str, String str2, byte[] bArr) {
        byte[] bArr2 = oag.f;
        boolean zEquals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = oag.e;
        String str3 = (zEquals || Arrays.equals(bArr, bArr3)) ? ":" : "!";
        if (str.length() <= 0) {
            return "!".equals(str3) ? str2.replace(":", "!") : ":".equals(str3) ? str2.replace("!", ":") : str2;
        }
        if (str2.equals("classes.dex")) {
            return str;
        }
        if (str2.contains("!") || str2.contains(":")) {
            return "!".equals(str3) ? str2.replace(":", "!") : ":".equals(str3) ? str2.replace("!", ":") : str2;
        }
        if (str2.endsWith(".apk")) {
            return str2;
        }
        return zr6.l(au1.l(str), (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) ? ":" : "!", str2);
    }

    public static HashMap q() {
        HashMap map = new HashMap(286);
        ArrayList arrayList = new ArrayList(25);
        arrayList.add("US");
        arrayList.add("AG");
        arrayList.add("AI");
        arrayList.add("AS");
        arrayList.add("BB");
        arrayList.add("BM");
        arrayList.add("BS");
        arrayList.add("CA");
        arrayList.add("DM");
        arrayList.add("DO");
        arrayList.add("GD");
        arrayList.add("GU");
        arrayList.add("JM");
        arrayList.add("KN");
        arrayList.add("KY");
        arrayList.add("LC");
        arrayList.add("MP");
        arrayList.add("MS");
        arrayList.add("PR");
        arrayList.add("SX");
        arrayList.add("TC");
        arrayList.add("TT");
        arrayList.add("VC");
        arrayList.add("VG");
        arrayList.add("VI");
        map.put(1, arrayList);
        ArrayList arrayList2 = new ArrayList(2);
        arrayList2.add("RU");
        arrayList2.add("KZ");
        ArrayList arrayListF = ms2.f(36, map, ms2.f(34, map, ms2.f(33, map, ms2.f(32, map, ms2.f(31, map, ms2.f(30, map, ms2.f(27, map, ms2.f(20, map, ms2.f(7, map, arrayList2, 1, "EG"), 1, "ZA"), 1, "GR"), 1, "NL"), 1, "BE"), 1, "FR"), 1, "ES"), 1, "HU"), 2, "IT");
        arrayListF.add("VA");
        map.put(39, arrayListF);
        ArrayList arrayList3 = new ArrayList(1);
        arrayList3.add("RO");
        ArrayList arrayListF2 = ms2.f(43, map, ms2.f(41, map, ms2.f(40, map, arrayList3, 1, "CH"), 1, "AT"), 4, "GB");
        arrayListF2.add("GG");
        arrayListF2.add("IM");
        arrayListF2.add("JE");
        map.put(44, arrayListF2);
        ArrayList arrayList4 = new ArrayList(1);
        arrayList4.add("DK");
        ArrayList arrayListF3 = ms2.f(46, map, ms2.f(45, map, arrayList4, 1, "SE"), 2, "NO");
        arrayListF3.add("SJ");
        map.put(47, arrayListF3);
        ArrayList arrayList5 = new ArrayList(1);
        arrayList5.add("PL");
        ArrayList arrayListF4 = ms2.f(60, map, ms2.f(58, map, ms2.f(57, map, ms2.f(56, map, ms2.f(55, map, ms2.f(54, map, ms2.f(53, map, ms2.f(52, map, ms2.f(51, map, ms2.f(49, map, ms2.f(48, map, arrayList5, 1, "DE"), 1, "PE"), 1, "MX"), 1, "CU"), 1, "AR"), 1, "BR"), 1, "CL"), 1, "CO"), 1, "VE"), 1, "MY"), 3, "AU");
        arrayListF4.add("CC");
        arrayListF4.add("CX");
        map.put(61, arrayListF4);
        ArrayList arrayList6 = new ArrayList(1);
        arrayList6.add("ID");
        ArrayList arrayListF5 = ms2.f(211, map, ms2.f(98, map, ms2.f(95, map, ms2.f(94, map, ms2.f(93, map, ms2.f(92, map, ms2.f(91, map, ms2.f(90, map, ms2.f(86, map, ms2.f(84, map, ms2.f(82, map, ms2.f(81, map, ms2.f(66, map, ms2.f(65, map, ms2.f(64, map, ms2.f(63, map, ms2.f(62, map, arrayList6, 1, "PH"), 1, "NZ"), 1, "SG"), 1, "TH"), 1, "JP"), 1, "KR"), 1, "VN"), 1, "CN"), 1, "TR"), 1, "IN"), 1, "PK"), 1, "AF"), 1, "LK"), 1, "MM"), 1, "IR"), 1, "SS"), 2, "MA");
        arrayListF5.add("EH");
        map.put(212, arrayListF5);
        ArrayList arrayList7 = new ArrayList(1);
        arrayList7.add("DZ");
        ArrayList arrayListF6 = ms2.f(261, map, ms2.f(260, map, ms2.f(258, map, ms2.f(257, map, ms2.f(256, map, ms2.f(255, map, ms2.f(254, map, ms2.f(253, map, ms2.f(252, map, ms2.f(251, map, ms2.f(250, map, ms2.f(249, map, ms2.f(248, map, ms2.f(247, map, ms2.f(246, map, ms2.f(245, map, ms2.f(244, map, ms2.f(243, map, ms2.f(242, map, ms2.f(241, map, ms2.f(240, map, ms2.f(239, map, ms2.f(238, map, ms2.f(237, map, ms2.f(236, map, ms2.f(235, map, ms2.f(234, map, ms2.f(233, map, ms2.f(232, map, ms2.f(231, map, ms2.f(230, map, ms2.f(229, map, ms2.f(228, map, ms2.f(227, map, ms2.f(226, map, ms2.f(225, map, ms2.f(224, map, ms2.f(223, map, ms2.f(222, map, ms2.f(221, map, ms2.f(220, map, ms2.f(218, map, ms2.f(216, map, ms2.f(213, map, arrayList7, 1, "TN"), 1, "LY"), 1, "GM"), 1, "SN"), 1, "MR"), 1, "ML"), 1, "GN"), 1, "CI"), 1, "BF"), 1, "NE"), 1, "TG"), 1, "BJ"), 1, "MU"), 1, "LR"), 1, "SL"), 1, "GH"), 1, "NG"), 1, "TD"), 1, "CF"), 1, "CM"), 1, "CV"), 1, "ST"), 1, "GQ"), 1, "GA"), 1, "CG"), 1, "CD"), 1, "AO"), 1, "GW"), 1, "IO"), 1, "AC"), 1, "SC"), 1, "SD"), 1, "RW"), 1, "ET"), 1, "SO"), 1, "DJ"), 1, "KE"), 1, "TZ"), 1, "UG"), 1, "BI"), 1, "MZ"), 1, "ZM"), 1, "MG"), 2, "RE");
        arrayListF6.add("YT");
        map.put(262, arrayListF6);
        ArrayList arrayList8 = new ArrayList(1);
        arrayList8.add("ZW");
        ArrayList arrayListF7 = ms2.f(269, map, ms2.f(268, map, ms2.f(267, map, ms2.f(266, map, ms2.f(265, map, ms2.f(264, map, ms2.f(263, map, arrayList8, 1, "NA"), 1, "MW"), 1, "LS"), 1, "BW"), 1, "SZ"), 1, "KM"), 2, "SH");
        arrayListF7.add("TA");
        map.put(290, arrayListF7);
        ArrayList arrayList9 = new ArrayList(1);
        arrayList9.add("ER");
        ArrayList arrayListF8 = ms2.f(357, map, ms2.f(356, map, ms2.f(355, map, ms2.f(354, map, ms2.f(353, map, ms2.f(352, map, ms2.f(351, map, ms2.f(350, map, ms2.f(299, map, ms2.f(298, map, ms2.f(297, map, ms2.f(291, map, arrayList9, 1, "AW"), 1, "FO"), 1, "GL"), 1, "GI"), 1, "PT"), 1, "LU"), 1, "IE"), 1, "IS"), 1, "AL"), 1, "MT"), 1, "CY"), 2, "FI");
        arrayListF8.add("AX");
        map.put(358, arrayListF8);
        ArrayList arrayList10 = new ArrayList(1);
        arrayList10.add("BG");
        ArrayList arrayListF9 = ms2.f(509, map, ms2.f(508, map, ms2.f(HttpStatus.SC_INSUFFICIENT_STORAGE, map, ms2.f(506, map, ms2.f(HttpStatus.SC_HTTP_VERSION_NOT_SUPPORTED, map, ms2.f(HttpStatus.SC_GATEWAY_TIMEOUT, map, ms2.f(HttpStatus.SC_SERVICE_UNAVAILABLE, map, ms2.f(HttpStatus.SC_BAD_GATEWAY, map, ms2.f(HttpStatus.SC_NOT_IMPLEMENTED, map, ms2.f(500, map, ms2.f(HttpStatus.SC_LOCKED, map, ms2.f(421, map, ms2.f(HttpStatus.SC_METHOD_FAILURE, map, ms2.f(389, map, ms2.f(387, map, ms2.f(386, map, ms2.f(385, map, ms2.f(383, map, ms2.f(382, map, ms2.f(381, map, ms2.f(380, map, ms2.f(378, map, ms2.f(377, map, ms2.f(376, map, ms2.f(375, map, ms2.f(374, map, ms2.f(373, map, ms2.f(372, map, ms2.f(371, map, ms2.f(370, map, ms2.f(359, map, arrayList10, 1, "LT"), 1, "LV"), 1, "EE"), 1, "MD"), 1, "AM"), 1, "BY"), 1, "AD"), 1, "MC"), 1, "SM"), 1, "UA"), 1, "RS"), 1, "ME"), 1, "XK"), 1, "HR"), 1, "SI"), 1, "BA"), 1, "MK"), 1, "CZ"), 1, "SK"), 1, "LI"), 1, "FK"), 1, "BZ"), 1, "GT"), 1, "SV"), 1, "HN"), 1, "NI"), 1, "CR"), 1, "PA"), 1, "PM"), 1, "HT"), 3, "GP");
        arrayListF9.add("BL");
        arrayListF9.add("MF");
        map.put(590, arrayListF9);
        ArrayList arrayList11 = new ArrayList(1);
        arrayList11.add("BO");
        ArrayList arrayListF10 = ms2.f(598, map, ms2.f(597, map, ms2.f(596, map, ms2.f(595, map, ms2.f(594, map, ms2.f(593, map, ms2.f(592, map, ms2.f(591, map, arrayList11, 1, "GY"), 1, "EC"), 1, "GF"), 1, "PY"), 1, "MQ"), 1, "SR"), 1, "UY"), 2, "CW");
        arrayListF10.add("BQ");
        map.put(599, arrayListF10);
        ArrayList arrayList12 = new ArrayList(1);
        arrayList12.add("TL");
        map.put(998, ms2.f(996, map, ms2.f(995, map, ms2.f(994, map, ms2.f(993, map, ms2.f(992, map, ms2.f(979, map, ms2.f(977, map, ms2.f(976, map, ms2.f(975, map, ms2.f(974, map, ms2.f(973, map, ms2.f(972, map, ms2.f(971, map, ms2.f(970, map, ms2.f(968, map, ms2.f(967, map, ms2.f(966, map, ms2.f(965, map, ms2.f(964, map, ms2.f(963, map, ms2.f(962, map, ms2.f(961, map, ms2.f(960, map, ms2.f(888, map, ms2.f(886, map, ms2.f(883, map, ms2.f(882, map, ms2.f(881, map, ms2.f(880, map, ms2.f(878, map, ms2.f(870, map, ms2.f(856, map, ms2.f(855, map, ms2.f(853, map, ms2.f(852, map, ms2.f(850, map, ms2.f(808, map, ms2.f(800, map, ms2.f(692, map, ms2.f(691, map, ms2.f(690, map, ms2.f(689, map, ms2.f(688, map, ms2.f(687, map, ms2.f(686, map, ms2.f(685, map, ms2.f(683, map, ms2.f(682, map, ms2.f(681, map, ms2.f(680, map, ms2.f(679, map, ms2.f(678, map, ms2.f(677, map, ms2.f(676, map, ms2.f(675, map, ms2.f(674, map, ms2.f(673, map, ms2.f(672, map, ms2.f(670, map, arrayList12, 1, "NF"), 1, "BN"), 1, "NR"), 1, "PG"), 1, "TO"), 1, "SB"), 1, "VU"), 1, "FJ"), 1, "PW"), 1, "WF"), 1, "CK"), 1, "NU"), 1, "WS"), 1, "KI"), 1, "NC"), 1, "TV"), 1, "PF"), 1, "TK"), 1, "FM"), 1, "MH"), 1, "001"), 1, "001"), 1, "KP"), 1, "HK"), 1, "MO"), 1, "KH"), 1, "LA"), 1, "001"), 1, "001"), 1, "BD"), 1, "001"), 1, "001"), 1, "001"), 1, "TW"), 1, "001"), 1, "MV"), 1, "LB"), 1, "JO"), 1, "SY"), 1, "IQ"), 1, "KW"), 1, "SA"), 1, "YE"), 1, "OM"), 1, "PS"), 1, "AE"), 1, "IL"), 1, "BH"), 1, "QA"), 1, "BT"), 1, "MN"), 1, "NP"), 1, "001"), 1, "TJ"), 1, "TM"), 1, "AZ"), 1, "GE"), 1, "KG"), 1, "UZ"));
        return map;
    }

    public static int r(int i) {
        int i2 = 0;
        while (i > 0) {
            i2++;
            i >>>= 1;
        }
        return i2;
    }

    public static final int s(int i) {
        if (i == 0) {
            return 0;
        }
        return Color.parseColor(String.format("#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(i & 16777215)}, 1)));
    }

    public static final boolean t(es8 es8Var) {
        cu8 cu8Var = es8Var.a;
        l10 l10VarD = cu8Var.d();
        boolean z = l10VarD == null || l10VarD.b();
        if (l10VarD == null) {
            return true;
        }
        if (z) {
            List list = l10VarD.f;
            if (list.size() == 1) {
                long j = cu8Var.Y;
                Long l = (Long) list.get(0);
                if (l != null && j == l.longValue()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static f6d u(a66 a66Var) {
        f6d f6dVar = new f6d();
        f6dVar.o = v3c.j(a66Var, f6dVar, f6dVar);
        return f6dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:89:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x014f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void v(android.content.Intent r17) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m6d.v(android.content.Intent):void");
    }

    public static void w(String str, Bundle bundle) {
        try {
            fl5.b();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String string = bundle.getString("google.c.a.c_id");
            if (string != null) {
                bundle2.putString("_nmid", string);
            }
            String string2 = bundle.getString("google.c.a.c_l");
            if (string2 != null) {
                bundle2.putString("_nmn", string2);
            }
            String string3 = bundle.getString("google.c.a.m_l");
            if (!TextUtils.isEmpty(string3)) {
                bundle2.putString("label", string3);
            }
            String string4 = bundle.getString("google.c.a.m_c");
            if (!TextUtils.isEmpty(string4)) {
                bundle2.putString("message_channel", string4);
            }
            String string5 = bundle.getString("from");
            if (string5 == null || !string5.startsWith("/topics/")) {
                string5 = null;
            }
            if (string5 != null) {
                bundle2.putString("_nt", string5);
            }
            String string6 = bundle.getString("google.c.a.ts");
            if (string6 != null) {
                try {
                    bundle2.putInt("_nmt", Integer.parseInt(string6));
                } catch (NumberFormatException unused) {
                }
            }
            String string7 = bundle.containsKey("google.c.a.udt") ? bundle.getString("google.c.a.udt") : null;
            if (string7 != null) {
                try {
                    bundle2.putInt("_ndt", Integer.parseInt(string7));
                } catch (NumberFormatException unused2) {
                }
            }
            String str2 = sy4.D(bundle) ? "display" : "data";
            if ("_nr".equals(str) || "_nf".equals(str)) {
                bundle2.putString("_nmc", str2);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                bundle2.toString();
            }
            fl5 fl5VarB = fl5.b();
            fl5VarB.a();
            au1.r(fl5VarB.d.a(bd.class));
        } catch (IllegalStateException unused3) {
        }
    }

    public static Typeface x(Configuration configuration, Typeface typeface) {
        if (Build.VERSION.SDK_INT < 31 || configuration.fontWeightAdjustment == Integer.MAX_VALUE || configuration.fontWeightAdjustment == 0 || typeface == null) {
            return null;
        }
        return Typeface.create(typeface, z04.p(configuration.fontWeightAdjustment + typeface.getWeight(), 1, 1000), typeface.isItalic());
    }

    public static final void y(File file) {
        if (!file.exists()) {
            if (file.mkdirs()) {
                return;
            }
            throw new IOException("Can't create " + file);
        }
        if (file.isDirectory()) {
            return;
        }
        throw new IOException(file + " is not a directory");
    }

    public static final int z(int i, int i2) {
        if (i2 == 255) {
            return i;
        }
        if (i2 == 0) {
            return i & 16777215;
        }
        return (i & 16777215) | ((((i >>> 24) * (i2 + (i2 >> 7))) >> 8) << 24);
    }
}
