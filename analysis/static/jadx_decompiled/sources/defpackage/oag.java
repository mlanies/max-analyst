package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.ColorStateListDrawable;
import android.graphics.drawable.Drawable;
import android.hardware.biometrics.BiometricPrompt;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.security.identity.IdentityCredential;
import android.security.keystore.KeyGenParameterSpec;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Range;
import android.util.Size;
import android.view.Surface;
import com.facebook.common.file.FileUtils$CreateDirectoryException;
import com.facebook.common.file.FileUtils$FileDeleteException;
import com.facebook.common.file.FileUtils$ParentDirNotFoundException;
import com.facebook.common.file.FileUtils$RenameException;
import com.google.android.exoplayer2.ParserException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Signature;
import java.security.UnrecoverableKeyException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import kotlinx.coroutines.internal.ScopeCoroutine;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes.dex */
public abstract class oag {
    public static final o97 a = new o97("DISK_USAGE", 1);
    public static final byte[] b = {48, 49, 53, 0};
    public static final byte[] c = {48, 49, 48, 0};
    public static final byte[] d = {48, 48, 57, 0};
    public static final byte[] e = {48, 48, 53, 0};
    public static final byte[] f = {48, 48, 49, 0};
    public static final byte[] g = {48, 48, 49, 0};
    public static final byte[] h = {48, 48, 50, 0};

    public static void A(File file, File file2) throws FileUtils$RenameException {
        file.getClass();
        file2.delete();
        if (file.renameTo(file2)) {
            return;
        }
        Throwable fileNotFoundException = !file2.exists() ? file.getParentFile().exists() ? !file.exists() ? new FileNotFoundException(file.getAbsolutePath()) : null : new FileUtils$ParentDirNotFoundException(file.getAbsolutePath()) : new FileUtils$FileDeleteException(file2.getAbsolutePath());
        FileUtils$RenameException fileUtils$RenameException = new FileUtils$RenameException("Unknown error renaming " + file.getAbsolutePath() + " to " + file2.getAbsolutePath());
        fileUtils$RenameException.initCause(fileNotFoundException);
        throw fileUtils$RenameException;
    }

    public static b11 B(int i, ra4 ra4Var, yaf yafVar) throws ParserException {
        b11 b11VarB = b11.b(ra4Var, yafVar);
        while (true) {
            int i2 = b11VarB.b;
            if (i2 == i) {
                return b11VarB;
            }
            long j = b11VarB.c + 8;
            if (j > 2147483647L) {
                StringBuilder sb = new StringBuilder(51);
                sb.append("Chunk is too large (~2GB+) to skip; id: ");
                sb.append(i2);
                throw ParserException.c(sb.toString());
            }
            ra4Var.z((int) j);
            b11VarB = b11.b(ra4Var, yafVar);
        }
    }

    public static final Object C(ScopeCoroutine scopeCoroutine, ScopeCoroutine scopeCoroutine2, a66 a66Var) throws Throwable {
        Object lb3Var;
        Object objMakeCompletingOnce$kotlinx_coroutines_core;
        try {
            f8.c(2, a66Var);
            lb3Var = a66Var.invoke(scopeCoroutine2, scopeCoroutine);
        } catch (Throwable th) {
            lb3Var = new lb3(th, false);
        }
        tx3 tx3Var = tx3.a;
        if (lb3Var == tx3Var || (objMakeCompletingOnce$kotlinx_coroutines_core = scopeCoroutine.makeCompletingOnce$kotlinx_coroutines_core(lb3Var)) == a97.b) {
            return tx3Var;
        }
        if (objMakeCompletingOnce$kotlinx_coroutines_core instanceof lb3) {
            throw ((lb3) objMakeCompletingOnce$kotlinx_coroutines_core).a;
        }
        return a97.a(objMakeCompletingOnce$kotlinx_coroutines_core);
    }

    public static final List D(gi9 gi9Var) {
        return Collections.unmodifiableList(F(gi9Var));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0044 A[PHI: r5
      0x0044: PHI (r5v2 int) = (r5v1 int), (r5v3 int) binds: [B:6:0x001e, B:13:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long[] E(defpackage.gi9 r15) {
        /*
            int r0 = r15.d
            long[] r0 = new long[r0]
            long[] r1 = r15.b
            long[] r15 = r15.a
            int r2 = r15.length
            int r2 = r2 + (-2)
            if (r2 < 0) goto L49
            r3 = 0
            r4 = r3
            r5 = r4
        L10:
            r6 = r15[r4]
            long r8 = ~r6
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L44
            int r8 = r4 - r2
            int r8 = ~r8
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = r3
        L2a:
            if (r10 >= r8) goto L42
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.3E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L3e
            int r11 = r4 << 3
            int r11 = r11 + r10
            r11 = r1[r11]
            r0[r5] = r11
            int r5 = r5 + 1
        L3e:
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L2a
        L42:
            if (r8 != r9) goto L49
        L44:
            if (r4 == r2) goto L49
            int r4 = r4 + 1
            goto L10
        L49:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oag.E(gi9):long[]");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.ArrayList F(defpackage.gi9 r14) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r14.d
            r0.<init>(r1)
            long[] r1 = r14.b
            long[] r14 = r14.a
            int r2 = r14.length
            int r2 = r2 + (-2)
            if (r2 < 0) goto L4e
            r3 = 0
            r4 = r3
        L12:
            r5 = r14[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L49
            int r7 = r4 - r2
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L2c:
            if (r9 >= r7) goto L47
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L43
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            r0.add(r10)
        L43:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L2c
        L47:
            if (r7 != r8) goto L4e
        L49:
            if (r4 == r2) goto L4e
            int r4 = r4 + 1
            goto L12
        L4e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oag.F(gi9):java.util.ArrayList");
    }

    public static final gi9 G(Collection collection) {
        gi9 gi9Var = new gi9(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            gi9Var.a(((Number) it.next()).longValue());
        }
        return gi9Var;
    }

    public static BiometricPrompt.CryptoObject H(a8g a8gVar) {
        IdentityCredential identityCredential;
        if (a8gVar == null) {
            return null;
        }
        Cipher cipher = (Cipher) a8gVar.b;
        if (cipher != null) {
            return tz3.b(cipher);
        }
        Signature signature = (Signature) a8gVar.a;
        if (signature != null) {
            return tz3.a(signature);
        }
        Mac mac = (Mac) a8gVar.c;
        if (mac != null) {
            return tz3.c(mac);
        }
        if (Build.VERSION.SDK_INT < 30 || (identityCredential = (IdentityCredential) a8gVar.o) == null) {
            return null;
        }
        return uz3.a(identityCredential);
    }

    public static int I(Intent intent, int i) {
        boolean z = (33554432 & i) != 0;
        if (Build.VERSION.SDK_INT < 34) {
            return i;
        }
        String str = intent.getPackage();
        return ((str == null || str.length() == 0 || intent.getComponent() == null) && z) ? i | 16777216 : i;
    }

    public static final uc0 a(CharSequence charSequence, Long l) {
        if ((l == null || l.longValue() == 0) && charSequence == null) {
            return uc0.c;
        }
        long jLongValue = l != null ? l.longValue() : 0L;
        if (charSequence == null) {
            charSequence = "";
        }
        return new uc0(charSequence, jLongValue);
    }

    public static void b(CaptureRequest.Builder builder, ce3 ce3Var) {
        re6 re6VarU = wd6.w(ce3Var).u();
        for (aa0 aa0Var : re6VarU.g()) {
            CaptureRequest.Key key = (CaptureRequest.Key) aa0Var.c;
            try {
                builder.set(key, re6VarU.h(aa0Var));
            } catch (IllegalArgumentException unused) {
                Objects.toString(key);
            }
        }
    }

    public static void c(CaptureRequest.Builder builder, int i, oq0 oq0Var) {
        Map mapEmptyMap;
        if (i == 3 && oq0Var.a) {
            HashMap map = new HashMap();
            map.put(CaptureRequest.CONTROL_CAPTURE_INTENT, 1);
            mapEmptyMap = Collections.unmodifiableMap(map);
        } else {
            if (i != 4) {
                oq0Var.getClass();
            } else if (oq0Var.b) {
                HashMap map2 = new HashMap();
                map2.put(CaptureRequest.CONTROL_CAPTURE_INTENT, 2);
                mapEmptyMap = Collections.unmodifiableMap(map2);
            }
            mapEmptyMap = Collections.emptyMap();
        }
        for (Map.Entry entry : mapEmptyMap.entrySet()) {
            builder.set((CaptureRequest.Key) entry.getKey(), entry.getValue());
        }
    }

    public static boolean d(CharSequence charSequence, CharSequence charSequence2) {
        return charSequence != null ? charSequence.equals(charSequence2) : charSequence2 == null;
    }

    public static CaptureRequest e(kz1 kz1Var, CameraDevice cameraDevice, Map map, boolean z, oq0 oq0Var) throws CameraAccessException {
        CaptureRequest.Builder builderCreateCaptureRequest;
        pv1 pv1Var;
        if (cameraDevice == null) {
            return null;
        }
        List listUnmodifiableList = Collections.unmodifiableList(kz1Var.a);
        ArrayList arrayList = new ArrayList();
        Iterator it = listUnmodifiableList.iterator();
        while (it.hasNext()) {
            Surface surface = (Surface) map.get((xf4) it.next());
            if (surface == null) {
                throw new IllegalArgumentException("DeferrableSurface not in configuredSurfaceMap");
            }
            arrayList.add(surface);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        int i = kz1Var.c;
        if (i == 5 && (pv1Var = kz1Var.h) != null && (pv1Var.y() instanceof TotalCaptureResult)) {
            builderCreateCaptureRequest = cameraDevice.createReprocessCaptureRequest((TotalCaptureResult) pv1Var.y());
        } else if (i == 5) {
            builderCreateCaptureRequest = cameraDevice.createCaptureRequest(z ? 1 : 2);
        } else {
            builderCreateCaptureRequest = cameraDevice.createCaptureRequest(i);
        }
        c(builderCreateCaptureRequest, i, oq0Var);
        aa0 aa0Var = kz1.k;
        Range range = vb0.f;
        ce3 ce3Var = kz1Var.b;
        Range range2 = (Range) ce3Var.f(aa0Var, range);
        Objects.requireNonNull(range2);
        if (!range2.equals(range)) {
            CaptureRequest.Key key = CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE;
            Range range3 = (Range) ce3Var.f(aa0Var, range);
            Objects.requireNonNull(range3);
            builderCreateCaptureRequest.set(key, range3);
        }
        if (kz1Var.b() == 1 || kz1Var.c() == 1) {
            builderCreateCaptureRequest.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 0);
        } else if (kz1Var.b() == 2) {
            builderCreateCaptureRequest.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 2);
        } else if (kz1Var.c() == 2) {
            builderCreateCaptureRequest.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 1);
        }
        aa0 aa0Var2 = kz1.i;
        if (ce3Var.o(aa0Var2)) {
            builderCreateCaptureRequest.set(CaptureRequest.JPEG_ORIENTATION, (Integer) ce3Var.h(aa0Var2));
        }
        aa0 aa0Var3 = kz1.j;
        if (ce3Var.o(aa0Var3)) {
            builderCreateCaptureRequest.set(CaptureRequest.JPEG_QUALITY, Byte.valueOf(((Integer) ce3Var.h(aa0Var3)).byteValue()));
        }
        b(builderCreateCaptureRequest, ce3Var);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            builderCreateCaptureRequest.addTarget((Surface) it2.next());
        }
        builderCreateCaptureRequest.setTag(kz1Var.g);
        return builderCreateCaptureRequest.build();
    }

    public static t6d f(String str, pag pagVar, r6d[] r6dVarArr) {
        if (!(!w9e.C0(str))) {
            throw new IllegalArgumentException("Blank serial names are prohibited".toString());
        }
        if (!(!pagVar.equals(nae.e))) {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead".toString());
        }
        bg4 bg4Var = new bg4(str);
        return new t6d(str, pagVar, ((ArrayList) bg4Var.o).size(), ys.m0(r6dVarArr), bg4Var);
    }

    public static boolean g(ra4 ra4Var) {
        yaf yafVar = new yaf(8);
        int i = b11.b(ra4Var, yafVar).b;
        if (i != 1380533830 && i != 1380333108) {
            return false;
        }
        ra4Var.q(yafVar.a, 0, 4, false);
        yafVar.H(0);
        return yafVar.h() == 1463899717;
    }

    public static final Object h(on5 on5Var, k56 k56Var, c66 c66Var, Continuation continuation, mn5[] mn5VarArr) throws Throwable {
        x63 x63Var = new x63(on5Var, k56Var, c66Var, null, mn5VarArr);
        pn5 pn5Var = new pn5(continuation.getContext(), continuation);
        Object objC = C(pn5Var, pn5Var, x63Var);
        return objC == tx3.a ? objC : e5f.a;
    }

    public static void i(Context context, m7b m7bVar) {
        context.getResources();
        int i = q6c.a;
        p7b p7bVar = (p7b) m7bVar;
        z7d z7dVar = p7bVar.b;
        z7dVar.getClass();
        q6c.a = (int) z7dVar.q(PmsKey.f104reactionsmax, 8);
        q6c.b = new Size(160, 160);
        p7bVar.b.getClass();
        Set setEmptySet = Collections.emptySet();
        if (!setEmptySet.isEmpty()) {
            Iterator it = setEmptySet.iterator();
            while (it.hasNext() && !eae.i0("REACTION_BADGE", (CharSequence) it.next())) {
            }
        }
        int i2 = q6c.a;
        Set setEmptySet2 = Collections.emptySet();
        if (!setEmptySet2.isEmpty()) {
            Iterator it2 = setEmptySet2.iterator();
            while (it2.hasNext() && !eae.i0("REACTION_SELECT_PANEL", (CharSequence) it2.next())) {
            }
        }
        int i3 = q6c.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.gi9 j(defpackage.gi9 r14) {
        /*
            gi9 r0 = new gi9
            int r1 = r14.d
            r0.<init>(r1)
            long[] r1 = r14.b
            long[] r14 = r14.a
            int r2 = r14.length
            int r2 = r2 + (-2)
            if (r2 < 0) goto L4a
            r3 = 0
            r4 = r3
        L12:
            r5 = r14[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L45
            int r7 = r4 - r2
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L2c:
            if (r9 >= r7) goto L43
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L3f
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]
            r0.a(r10)
        L3f:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L2c
        L43:
            if (r7 != r8) goto L4a
        L45:
            if (r4 == r2) goto L4a
            int r4 = r4 + 1
            goto L12
        L4a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oag.j(gi9):gi9");
    }

    public static a8g k() throws NoSuchPaddingException, NoSuchAlgorithmException, IOException, InvalidKeyException, KeyStoreException, CertificateException, NoSuchProviderException {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            KeyGenParameterSpec.Builder builderB = sz3.b("androidxBiometric", 3);
            sz3.d(builderB);
            sz3.e(builderB);
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            sz3.c(keyGenerator, sz3.a(builderB));
            keyGenerator.generateKey();
            SecretKey secretKey = (SecretKey) keyStore.getKey("androidxBiometric", null);
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            cipher.init(1, secretKey);
            return new a8g(cipher);
        } catch (IOException | InvalidAlgorithmParameterException | InvalidKeyException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableKeyException | CertificateException | NoSuchPaddingException unused) {
            return null;
        }
    }

    public static l7 l(n99 n99Var) throws IOException {
        long jO;
        n99Var.k(4);
        int unsignedShort = n99Var.readUnsignedShort();
        if (unsignedShort > 100) {
            throw new IOException("Cannot read metadata.");
        }
        n99Var.k(6);
        int i = 0;
        while (true) {
            if (i >= unsignedShort) {
                jO = -1;
                break;
            }
            int iJ = n99Var.j();
            n99Var.k(4);
            jO = n99Var.o();
            n99Var.k(4);
            if (1835365473 == iJ) {
                break;
            }
            i++;
        }
        if (jO != -1) {
            n99Var.k((int) (jO - n99Var.e()));
            n99Var.k(12);
            long jO2 = n99Var.o();
            for (int i2 = 0; i2 < jO2; i2++) {
                int iJ2 = n99Var.j();
                long jO3 = n99Var.o();
                long jO4 = n99Var.o();
                if (1164798569 == iJ2 || 1701669481 == iJ2) {
                    return new l7(jO3 + jO, jO4, 7);
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    public static final int m(int i) {
        return (Build.VERSION.SDK_INT < 31 || (67108864 & i) != 0) ? i : i | 33554432;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public static final int n(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10) {
        ?? r0 = z;
        if (z2) {
            r0 = (z ? 1 : 0) | 2;
        }
        if (z3) {
            r0 = (r0 == true ? 1 : 0) | 4;
        }
        if (z4) {
            r0 = (r0 == true ? 1 : 0) | '\b';
        }
        if (z5) {
            r0 = (r0 == true ? 1 : 0) | 16;
        }
        int i = r0 | 32;
        if (z6) {
            i = r0 | 96;
        }
        if (z7) {
            i |= 128;
        }
        if (z8) {
            i |= 256;
        }
        if (z9) {
            i |= 512;
        }
        if (z10) {
            i |= LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        if (i == 0) {
            return -1;
        }
        return i;
    }

    public static fi6 o(SSLSession sSLSession) throws IOException {
        Certificate[] peerCertificates;
        List listK = nz4.a;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null".toString());
        }
        int iHashCode = cipherSuite.hashCode();
        if (iHashCode == 1019404634 ? cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") : iHashCode == 1208658923 && cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
            throw new IOException("cipherSuite == ".concat(cipherSuite));
        }
        u13 u13VarI = u13.t.i(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            throw new IllegalStateException("tlsVersion == null".toString());
        }
        if ("NONE".equals(protocol)) {
            throw new IOException("tlsVersion == NONE");
        }
        awe aweVarW = z04.w(protocol);
        try {
            peerCertificates = sSLSession.getPeerCertificates();
        } catch (SSLPeerUnverifiedException unused) {
        }
        List listK2 = peerCertificates != null ? naf.k((Certificate[]) Arrays.copyOf(peerCertificates, peerCertificates.length)) : listK;
        Certificate[] localCertificates = sSLSession.getLocalCertificates();
        if (localCertificates != null) {
            listK = naf.k((Certificate[]) Arrays.copyOf(localCertificates, localCertificates.length));
        }
        return new fi6(aweVarW, u13VarI, listK, new ie(3, listK2));
    }

    public static final PendingIntent p(Context context, int i, Intent intent) {
        return PendingIntent.getActivity(context, i, intent, I(intent, m(134217728)));
    }

    public static final int q(int i) {
        if (i == 0 || i == 1) {
            return 0;
        }
        if (i == 3) {
            return 180;
        }
        if (i != 6) {
            return i != 8 ? 0 : 270;
        }
        return 90;
    }

    public static ColorStateList r(Drawable drawable) {
        if (drawable instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) drawable).getColor());
        }
        if (drawable instanceof ColorStateListDrawable) {
            return ((ColorStateListDrawable) drawable).getColorStateList();
        }
        return null;
    }

    public static final boolean s(int i, int i2) {
        return (i & i2) == i2;
    }

    public static boolean t(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    public static boolean u(CharSequence charSequence) {
        return !t(charSequence);
    }

    public static String v(Collection collection) {
        if (collection == null) {
            return null;
        }
        Iterator it = collection.iterator();
        StringBuilder sb = new StringBuilder();
        while (it.hasNext()) {
            sb.append(it.next().toString());
            if (it.hasNext()) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    public static StaticLayout w(CharSequence charSequence, int i, int i2, TextPaint textPaint, int i3, Layout.Alignment alignment, boolean z, TextUtils.TruncateAt truncateAt, int i4, int i5, zoe zoeVar) {
        StaticLayout.Builder indents = StaticLayout.Builder.obtain(charSequence, i, i2, textPaint, i3).setAlignment(alignment).setLineSpacing(0.0f, 1.0f).setIncludePad(z).setEllipsize(truncateAt).setEllipsizedWidth(i4).setMaxLines(i5).setTextDirection(pag.m(zoeVar)).setBreakStrategy(0).setHyphenationFrequency(0).setIndents(null, null);
        indents.setJustificationMode(0);
        indents.setUseLineSpacingFromFallbacks(false);
        return indents.build();
    }

    public static String x(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        if (charSequence.length() == 0) {
            return "";
        }
        int length = charSequence.length() / 4;
        if (length == 0) {
            length = 1;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append("*");
        }
        sb.append(charSequence.subSequence(length, charSequence.length()));
        return sb.toString();
    }

    public static void y(File file) throws FileUtils$CreateDirectoryException {
        if (file.exists()) {
            if (file.isDirectory()) {
                return;
            }
            if (!file.delete()) {
                String absolutePath = file.getAbsolutePath();
                FileUtils$FileDeleteException fileUtils$FileDeleteException = new FileUtils$FileDeleteException(file.getAbsolutePath());
                FileUtils$CreateDirectoryException fileUtils$CreateDirectoryException = new FileUtils$CreateDirectoryException(absolutePath);
                fileUtils$CreateDirectoryException.initCause(fileUtils$FileDeleteException);
                throw fileUtils$CreateDirectoryException;
            }
        }
        if (!file.mkdirs() && !file.isDirectory()) {
            throw new FileUtils$CreateDirectoryException(file.getAbsolutePath());
        }
    }

    public static m99 z(FileInputStream fileInputStream) throws IOException {
        bw4 bw4Var = new bw4(fileInputStream);
        l7 l7VarL = l(bw4Var);
        bw4Var.k((int) (l7VarL.b - bw4Var.a));
        long j = l7VarL.c;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate((int) j);
        int i = fileInputStream.read(byteBufferAllocate.array());
        if (i != j) {
            throw new IOException("Needed " + j + " bytes, got " + i);
        }
        m99 m99Var = new m99();
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        int iPosition = byteBufferAllocate.position() + byteBufferAllocate.getInt(byteBufferAllocate.position());
        m99Var.o = byteBufferAllocate;
        m99Var.a = iPosition;
        int i2 = iPosition - byteBufferAllocate.getInt(iPosition);
        m99Var.b = i2;
        m99Var.c = ((ByteBuffer) m99Var.o).getShort(i2);
        return m99Var;
    }
}
