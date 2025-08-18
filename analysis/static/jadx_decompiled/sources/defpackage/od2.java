package defpackage;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.Layout;
import android.text.Spanned;
import android.util.Xml;
import android.view.View;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.Continuation;
import one.me.rlottie.ImageReceiver;
import one.me.rlottie.RLottieDrawable;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes2.dex */
public abstract class od2 {
    public static final Object a = new Object();
    public static final ob6 b = new ob6();
    public static final Object c = new Object();

    /* JADX WARN: Removed duplicated region for block: B:30:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A(defpackage.mn5 r5, kotlin.coroutines.Continuation r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof defpackage.aq5
            if (r0 == 0) goto L13
            r0 = r6
            aq5 r0 = (defpackage.aq5) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            aq5 r0 = new aq5
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.Y
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Z
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            xp5 r5 = r0.X
            mec r0 = r0.o
            a0(r6)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L2b
            goto L5e
        L2b:
            r6 = move-exception
            goto L5a
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            a0(r6)
            mec r6 = new mec
            r6.<init>()
            kotlinx.coroutines.internal.Symbol r2 = defpackage.ay9.a
            r6.a = r2
            xp5 r2 = new xp5
            r4 = 0
            r2.<init>(r6, r4)
            r0.o = r6     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L56
            r0.X = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L56
            r0.Z = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L56
            java.lang.Object r5 = r5.d(r2, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L56
            if (r5 != r1) goto L54
            goto L64
        L54:
            r0 = r6
            goto L5e
        L56:
            r5 = move-exception
            r0 = r6
            r6 = r5
            r5 = r2
        L5a:
            java.lang.Object r1 = r6.a
            if (r1 != r5) goto L6d
        L5e:
            java.lang.Object r1 = r0.a
            kotlinx.coroutines.internal.Symbol r5 = defpackage.ay9.a
            if (r1 == r5) goto L65
        L64:
            return r1
        L65:
            java.util.NoSuchElementException r5 = new java.util.NoSuchElementException
            java.lang.String r6 = "Expected at least one element"
            r5.<init>(r6)
            throw r5
        L6d:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.od2.A(mn5, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object B(defpackage.mn5 r5, defpackage.yif r6, kotlin.coroutines.Continuation r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof defpackage.eq5
            if (r0 == 0) goto L13
            r0 = r7
            eq5 r0 = (defpackage.eq5) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            eq5 r0 = new eq5
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.Y
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Z
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            zp5 r5 = r0.X
            mec r6 = r0.o
            a0(r7)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L2b
            goto L5a
        L2b:
            r7 = move-exception
            goto L56
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            a0(r7)
            mec r7 = new mec
            r7.<init>()
            zp5 r2 = new zp5
            r4 = 1
            r2.<init>(r6, r7, r4)
            r0.o = r7     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L52
            r0.X = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L52
            r0.Z = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L52
            java.lang.Object r5 = r5.d(r2, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L52
            if (r5 != r1) goto L50
            goto L5c
        L50:
            r6 = r7
            goto L5a
        L52:
            r5 = move-exception
            r6 = r7
            r7 = r5
            r5 = r2
        L56:
            java.lang.Object r0 = r7.a
            if (r0 != r5) goto L5d
        L5a:
            java.lang.Object r1 = r6.a
        L5c:
            return r1
        L5d:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.od2.B(mn5, yif, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object C(defpackage.mn5 r5, kotlin.coroutines.Continuation r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof defpackage.dq5
            if (r0 == 0) goto L13
            r0 = r6
            dq5 r0 = (defpackage.dq5) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            dq5 r0 = new dq5
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.Y
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Z
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            xp5 r5 = r0.X
            mec r0 = r0.o
            a0(r6)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L2b
            goto L5a
        L2b:
            r6 = move-exception
            goto L56
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            a0(r6)
            mec r6 = new mec
            r6.<init>()
            xp5 r2 = new xp5
            r4 = 1
            r2.<init>(r6, r4)
            r0.o = r6     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L52
            r0.X = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L52
            r0.Z = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L52
            java.lang.Object r5 = r5.d(r2, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L52
            if (r5 != r1) goto L50
            goto L5c
        L50:
            r0 = r6
            goto L5a
        L52:
            r5 = move-exception
            r0 = r6
            r6 = r5
            r5 = r2
        L56:
            java.lang.Object r1 = r6.a
            if (r1 != r5) goto L5d
        L5a:
            java.lang.Object r1 = r0.a
        L5c:
            return r1
        L5d:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.od2.C(mn5, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final t03 D(mn5 mn5Var, a66 a66Var) {
        int i = wp5.a;
        return new t03(new zn5(mn5Var, a66Var, 4), 10);
    }

    public static mn5 E(mn5 mn5Var) {
        int i = wp5.a;
        if (i > 0) {
            return i == 1 ? new t03(mn5Var, 10) : new q32(i, -2, 1, hz4.a, mn5Var);
        }
        throw new IllegalArgumentException(zr6.h(i, "Expected positive concurrency level, but had ").toString());
    }

    public static final mn5 F(mn5 mn5Var, lx3 lx3Var) {
        if (lx3Var.get(c32.X) == null) {
            return lx3Var.equals(hz4.a) ? mn5Var : mn5Var instanceof y66 ? np8.r((y66) mn5Var, lx3Var, 0, 0, 6) : new t32(0, 0, 12, lx3Var, mn5Var);
        }
        throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + lx3Var).toString());
    }

    public static String G(String str, Object... objArr) {
        int iIndexOf;
        StringBuilder sb = new StringBuilder((objArr.length * 16) + str.length());
        int i = 0;
        int i2 = 0;
        while (i < objArr.length && (iIndexOf = str.indexOf("%s", i2)) != -1) {
            sb.append(str.substring(i2, iIndexOf));
            sb.append(objArr[i]);
            i2 = iIndexOf + 2;
            i++;
        }
        sb.append(str.substring(i2));
        if (i < objArr.length) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i3 = i + 1; i3 < objArr.length; i3++) {
                sb.append(", ");
                sb.append(objArr[i3]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static Set H() {
        try {
            Object objInvoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (objInvoke == null) {
                return Collections.emptySet();
            }
            Set set = (Set) objInvoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.emptySet();
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.emptySet();
        }
    }

    public static Intent I(Activity activity) {
        Intent parentActivityIntent = activity.getParentActivityIntent();
        if (parentActivityIntent != null) {
            return parentActivityIntent;
        }
        try {
            String strK = K(activity, activity.getComponentName());
            if (strK == null) {
                return null;
            }
            ComponentName componentName = new ComponentName(activity, strK);
            try {
                return K(activity, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static Intent J(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String strK = K(context, componentName);
        if (strK == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), strK);
        return K(context, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    public static String K(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String string;
        ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(componentName, 269222528);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }

    public static final vxd L(mn5 mn5Var, sx3 sx3Var) {
        return j47.T(sx3Var, null, null, new so5(mn5Var, null), 3);
    }

    public static final x32 M(mn5 mn5Var, a66 a66Var) {
        int i = wp5.a;
        return d0(mn5Var, new vp5(a66Var, (Continuation) null, 0));
    }

    public static final m32 N(mn5... mn5VarArr) {
        int i = wp5.a;
        return new m32(mn5VarArr.length == 0 ? nz4.a : new zs(0, mn5VarArr), hz4.a, -2, 1, 1);
    }

    public static void O(Context context, String str) {
        synchronized (a) {
            if (str.equals("")) {
                context.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                return;
            }
            try {
                FileOutputStream fileOutputStreamOpenFileOutput = context.openFileOutput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file", 0);
                XmlSerializer xmlSerializerNewSerializer = Xml.newSerializer();
                try {
                    xmlSerializerNewSerializer.setOutput(fileOutputStreamOpenFileOutput, null);
                    xmlSerializerNewSerializer.startDocument("UTF-8", Boolean.TRUE);
                    xmlSerializerNewSerializer.startTag(null, "locales");
                    xmlSerializerNewSerializer.attribute(null, "application_locales", str);
                    xmlSerializerNewSerializer.endTag(null, "locales");
                    xmlSerializerNewSerializer.endDocument();
                } catch (Exception unused) {
                    if (fileOutputStreamOpenFileOutput != null) {
                    }
                } catch (Throwable th) {
                    if (fileOutputStreamOpenFileOutput != null) {
                        try {
                            fileOutputStreamOpenFileOutput.close();
                        } catch (IOException unused2) {
                        }
                    }
                    throw th;
                }
                if (fileOutputStreamOpenFileOutput != null) {
                    try {
                        fileOutputStreamOpenFileOutput.close();
                    } catch (IOException unused3) {
                    }
                }
            } catch (FileNotFoundException unused4) {
            }
        }
    }

    public static final void P(Continuation continuation) {
        ux3 callerFrame;
        boolean z = x44.a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = w44.a;
        w44 w44Var = x44.c;
        if (atomicIntegerFieldUpdater.get(w44Var) > 0) {
            if (x44.a && continuation.getContext() == hz4.a) {
                return;
            }
            if (!"RUNNING".equals("RUNNING")) {
                callerFrame = continuation instanceof ux3 ? (ux3) continuation : null;
                if (callerFrame != null) {
                    do {
                        callerFrame = callerFrame.getCallerFrame();
                    } while (callerFrame != null);
                    return;
                }
                return;
            }
            callerFrame = continuation instanceof ux3 ? (ux3) continuation : null;
            if (callerFrame != null && atomicIntegerFieldUpdater.get(w44Var) > 0) {
                au1.r(x44.b.remove(callerFrame));
                do {
                    callerFrame = callerFrame.getCallerFrame();
                } while (callerFrame != null);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x003d, code lost:
    
        r1 = r3.getAttributeValue(null, "application_locales");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String Q(android.content.Context r8) {
        /*
            java.lang.Object r0 = defpackage.od2.a
            monitor-enter(r0)
            java.lang.String r1 = ""
            java.lang.String r2 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            java.io.FileInputStream r2 = r8.openFileInput(r2)     // Catch: java.lang.Throwable -> L4a java.io.FileNotFoundException -> L63
            org.xmlpull.v1.XmlPullParser r3 = android.util.Xml.newPullParser()     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L52
            java.lang.String r4 = "UTF-8"
            r3.setInput(r2, r4)     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L52
            int r4 = r3.getDepth()     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L52
        L18:
            int r5 = r3.next()     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L52
            r6 = 1
            if (r5 == r6) goto L44
            r6 = 3
            if (r5 != r6) goto L2b
            int r7 = r3.getDepth()     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L52
            if (r7 <= r4) goto L44
            goto L2b
        L29:
            r8 = move-exception
            goto L4c
        L2b:
            if (r5 == r6) goto L18
            r6 = 4
            if (r5 != r6) goto L31
            goto L18
        L31:
            java.lang.String r5 = r3.getName()     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L52
            java.lang.String r6 = "locales"
            boolean r5 = r5.equals(r6)     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L52
            if (r5 == 0) goto L18
            java.lang.String r4 = "application_locales"
            r5 = 0
            java.lang.String r1 = r3.getAttributeValue(r5, r4)     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L52
        L44:
            if (r2 == 0) goto L55
        L46:
            r2.close()     // Catch: java.lang.Throwable -> L4a java.io.IOException -> L55
            goto L55
        L4a:
            r8 = move-exception
            goto L65
        L4c:
            if (r2 == 0) goto L51
            r2.close()     // Catch: java.lang.Throwable -> L4a java.io.IOException -> L51
        L51:
            throw r8     // Catch: java.lang.Throwable -> L4a
        L52:
            if (r2 == 0) goto L55
            goto L46
        L55:
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Throwable -> L4a
            if (r2 != 0) goto L5c
            goto L61
        L5c:
            java.lang.String r2 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            r8.deleteFile(r2)     // Catch: java.lang.Throwable -> L4a
        L61:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4a
            return r1
        L63:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4a
            return r1
        L65:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4a
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.od2.Q(android.content.Context):java.lang.String");
    }

    public static final f32 R(e32 e32Var) {
        return new f32(e32Var, false);
    }

    public static final ac S(mqc mqcVar, long j, a66 a66Var) {
        if (j <= 0) {
            throw new IllegalArgumentException(ey8.h(j, "Expected positive amount of retries, but had ").toString());
        }
        return new ac(mqcVar, 19, new hp5(j, a66Var, null));
    }

    public static final void T(vte vteVar, long j) {
        if (vteVar instanceof wte) {
            wte wteVar = (wte) vteVar;
            synchronized (wteVar) {
                if (j != 0) {
                    if (wteVar.a == null) {
                        wteVar.a = Long.valueOf(TimeUnit.NANOSECONDS.toMillis(j));
                        wteVar.b = Long.valueOf(SystemClock.elapsedRealtime());
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object U(defpackage.t03 r5, kotlin.coroutines.Continuation r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof defpackage.fq5
            if (r0 == 0) goto L13
            r0 = r6
            fq5 r0 = (defpackage.fq5) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            fq5 r0 = new fq5
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.Y
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Z
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            xp5 r5 = r0.X
            mec r0 = r0.o
            a0(r6)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L2b
            goto L5e
        L2b:
            r6 = move-exception
            goto L5a
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            a0(r6)
            mec r6 = new mec
            r6.<init>()
            kotlinx.coroutines.internal.Symbol r2 = defpackage.ay9.a
            r6.a = r2
            xp5 r2 = new xp5
            r4 = 2
            r2.<init>(r6, r4)
            r0.o = r6     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L56
            r0.X = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L56
            r0.Z = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L56
            java.lang.Object r5 = r5.d(r2, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L56
            if (r5 != r1) goto L54
            goto L66
        L54:
            r0 = r6
            goto L5e
        L56:
            r5 = move-exception
            r0 = r6
            r6 = r5
            r5 = r2
        L5a:
            java.lang.Object r1 = r6.a
            if (r1 != r5) goto L67
        L5e:
            java.lang.Object r5 = r0.a
            kotlinx.coroutines.internal.Symbol r6 = defpackage.ay9.a
            if (r5 != r6) goto L65
            r5 = 0
        L65:
            r1 = r5
        L66:
            return r1
        L67:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.od2.U(t03, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static void V(p5b p5bVar, long j) {
        if (!(j >= 0)) {
            throw new IllegalArgumentException();
        }
        while (j > 0) {
            long jSkip = p5bVar.skip(j);
            if (jSkip <= 0) {
                if (p5bVar.read() == -1) {
                    return;
                } else {
                    jSkip = 1;
                }
            }
            j -= jSkip;
        }
    }

    public static final void W(View view, Layout layout, ImageReceiver imageReceiver) {
        CharSequence text = layout.getText();
        int length = text.length();
        Object[] spans = null;
        try {
            Spanned spanned = text instanceof Spanned ? (Spanned) text : null;
            if (spanned != null) {
                spans = spanned.getSpans(0, length, ak.class);
            }
        } catch (Throwable unused) {
        }
        if (spans == null) {
            spans = new ak[0];
        }
        for (Object obj : spans) {
            ak akVar = (ak) obj;
            zj zjVar = akVar.s0;
            Drawable drawableB = zjVar.b();
            RLottieDrawable rLottieDrawable = zjVar.x0;
            if (drawableB == rLottieDrawable && rLottieDrawable != null) {
                rLottieDrawable.addParentView(imageReceiver);
            }
            zj zjVar2 = akVar.s0;
            zjVar2.setCallback(view);
            zjVar2.start();
        }
    }

    public static final w7c X(mn5 mn5Var, sx3 sx3Var, xld xldVar, Object obj) {
        ty tyVarJ = i24.j(mn5Var, 1);
        q0e q0eVarA = r0e.a(obj);
        j47.S(sx3Var, (lx3) tyVarJ.o, tpa.f(xldVar, wld.a) ? vx3.a : vx3.o, new iq5(xldVar, (mn5) tyVarJ.c, q0eVarA, obj, null));
        return new w7c(q0eVarA);
    }

    public static final void Y(Layout layout, ImageReceiver imageReceiver) {
        Spanned spanned;
        CharSequence text = layout.getText();
        int length = text.length();
        try {
            spanned = text instanceof Spanned ? (Spanned) text : null;
        } catch (Throwable unused) {
        }
        Object[] spans = spanned != null ? spanned.getSpans(0, length, ak.class) : null;
        if (spans == null) {
            spans = new ak[0];
        }
        for (Object obj : spans) {
            ak akVar = (ak) obj;
            akVar.s0.setCallback(null);
            zj zjVar = akVar.s0;
            RLottieDrawable rLottieDrawable = zjVar.x0;
            if (rLottieDrawable != null) {
                rLottieDrawable.removeParentView(imageReceiver);
            }
            RLottieDrawable rLottieDrawable2 = zjVar.x0;
            if (rLottieDrawable2 == null || !rLottieDrawable2.hasParentViews()) {
                zjVar.stop();
            }
        }
    }

    public static final jp5 Z(mn5 mn5Var, int i) {
        if (i > 0) {
            return new jp5(mn5Var, i, 1);
        }
        throw new IllegalArgumentException(wg0.g(i, "Requested element count ", " should be positive").toString());
    }

    public static lg3 a(jqe jqeVar, Bundle bundle, int i) {
        if ((i & 2) != 0) {
            bundle = null;
        }
        return new lg3(jqeVar, bundle, null);
    }

    public static final void a0(Object obj) throws Throwable {
        if (obj instanceof njc) {
            throw ((njc) obj).a;
        }
    }

    public static Object b(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    public static void b0(iv1 iv1Var, ArrayList arrayList) {
        if (iv1Var instanceof jv1) {
            Iterator it = ((jv1) iv1Var).a.iterator();
            while (it.hasNext()) {
                b0((iv1) it.next(), arrayList);
            }
        } else if (iv1Var instanceof jz1) {
            arrayList.add(((jz1) iv1Var).a);
        } else {
            arrayList.add(new ju1(iv1Var));
        }
    }

    public static void c(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }

    public static final qre c0(gbf gbfVar, kge kgeVar) {
        ArrayList arrayList;
        ArrayList arrayList2 = null;
        dbf dbfVar = gbfVar.b;
        nre nreVar = dbfVar != null ? new nre(dbfVar.a, dbfVar.b) : null;
        pre preVar = gbfVar.a != null ? kgeVar != null ? new pre(kgeVar) : null : null;
        List<ebf> list = gbfVar.c;
        if (list != null) {
            ArrayList arrayList3 = new ArrayList(z53.S(list, 10));
            for (ebf ebfVar : list) {
                arrayList3.add(new ore(ebfVar.a, ebfVar.b, ebfVar.c, ebfVar.d, ebfVar.e, ebfVar.g, ebfVar.f));
            }
            arrayList = arrayList3;
        } else {
            arrayList = null;
        }
        List<ebf> list2 = gbfVar.d;
        if (list2 != null) {
            arrayList2 = new ArrayList(z53.S(list2, 10));
            for (ebf ebfVar2 : list2) {
                arrayList2.add(new ore(ebfVar2.a, ebfVar2.b, ebfVar2.c, ebfVar2.d, ebfVar2.e, ebfVar2.g, ebfVar2.f));
            }
        }
        return new qre(preVar, nreVar, arrayList, arrayList2, gbfVar.e);
    }

    public static final du4 d(int i) {
        if (i == 0) {
            return du4.a;
        }
        if (i == 1) {
            return du4.b;
        }
        if (i == 2) {
            return du4.c;
        }
        if (i == 3) {
            return du4.o;
        }
        if (i == 4) {
            return du4.X;
        }
        du4 du4Var = du4.Y;
        if (i == 5) {
            return du4Var;
        }
        hm9.p("OneMeDynamicFont", zr6.h(i, "unknown font size mode "), new IllegalStateException(zr6.h(i, "unknown font size mode ")));
        return du4Var;
    }

    public static final x32 d0(mn5 mn5Var, c66 c66Var) {
        int i = wp5.a;
        return new x32(c66Var, mn5Var, hz4.a, -2, 1);
    }

    public static final mn5 e(mn5 mn5Var, int i, int i2) {
        if (i < 0 && i != -2 && i != -1) {
            throw new IllegalArgumentException(zr6.h(i, "Buffer size should be non-negative, BUFFERED, or CONFLATED, but was ").toString());
        }
        if (i == -1 && i2 != 1) {
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
        }
        if (i == -1) {
            i2 = 2;
            i = 0;
        }
        int i3 = i;
        int i4 = i2;
        return mn5Var instanceof y66 ? np8.r((y66) mn5Var, null, i3, i4, 1) : new t32(i3, i4, 2, null, mn5Var);
    }

    public static final void e0(y5f y5fVar) {
        y5fVar.c(b64.class, new lxc(11));
    }

    public static /* synthetic */ mn5 f(mn5 mn5Var, int i, int i2) {
        if ((i2 & 1) != 0) {
            i = -2;
        }
        return e(mn5Var, i, 1);
    }

    public static final void f0(y5f y5fVar) {
        y5fVar.e(ejf.class, new mxc(10));
        y5fVar.e(ygf.class, new mxc(11));
        y5fVar.e(o60.class, new mxc(12));
        y5fVar.e(pk7.class, new mxc(13));
        y5fVar.e(lac.class, new mxc(14));
    }

    public static final kq1 g(a66 a66Var) {
        return new kq1(a66Var, hz4.a, -2, 1);
    }

    public static final vy1 h(mn5 mn5Var) {
        if (!(mn5Var instanceof vy1)) {
            mn5Var = new xy1(mn5Var);
        }
        return (vy1) mn5Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable i(defpackage.mn5 r5, defpackage.on5 r6, kotlin.coroutines.Continuation r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof defpackage.fp5
            if (r0 == 0) goto L13
            r0 = r7
            fp5 r0 = (defpackage.fp5) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            fp5 r0 = new fp5
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.X
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            mec r5 = r0.o
            a0(r7)     // Catch: java.lang.Throwable -> L29
            goto L4e
        L29:
            r6 = move-exception
            r1 = r6
            goto L53
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            a0(r7)
            mec r7 = new mec
            r7.<init>()
            zb r2 = new zb     // Catch: java.lang.Throwable -> L50
            r4 = 20
            r2.<init>(r6, r4, r7)     // Catch: java.lang.Throwable -> L50
            r0.o = r7     // Catch: java.lang.Throwable -> L50
            r0.Y = r3     // Catch: java.lang.Throwable -> L50
            java.lang.Object r5 = r5.d(r2, r0)     // Catch: java.lang.Throwable -> L50
            if (r5 != r1) goto L4e
            goto L82
        L4e:
            r1 = 0
            goto L82
        L50:
            r5 = move-exception
            r1 = r5
            r5 = r7
        L53:
            java.lang.Object r5 = r5.a
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            if (r5 == 0) goto L5f
            boolean r6 = r5.equals(r1)
            if (r6 != 0) goto L7f
        L5f:
            c32 r6 = defpackage.c32.X
            lx3 r7 = r0.b
            jx3 r6 = r7.get(r6)
            x77 r6 = (defpackage.x77) r6
            if (r6 == 0) goto L80
            boolean r7 = r6.isCancelled()
            if (r7 != 0) goto L72
            goto L80
        L72:
            java.util.concurrent.CancellationException r6 = r6.getCancellationException()
            if (r6 == 0) goto L80
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L7f
            goto L80
        L7f:
            throw r1
        L80:
            if (r5 != 0) goto L83
        L82:
            return r1
        L83:
            boolean r6 = r1 instanceof java.util.concurrent.CancellationException
            if (r6 == 0) goto L8b
            defpackage.j47.e(r5, r1)
            throw r5
        L8b:
            defpackage.j47.e(r1, r5)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.od2.i(mn5, on5, kotlin.coroutines.Continuation):java.io.Serializable");
    }

    public static void j(Boolean bool) {
        if (!bool.booleanValue()) {
            throw new IllegalArgumentException();
        }
    }

    public static void k(String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void l(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(G(str, objArr));
        }
    }

    public static void m(int i, int i2) {
        String strG;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                strG = G("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    throw new IllegalArgumentException(zr6.h(i2, "negative size: "));
                }
                strG = G("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strG);
        }
    }

    public static void n(long j, String str) {
        if (j >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " (" + j + ") must be >= 0");
    }

    public static void o(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(String.valueOf(str));
        }
    }

    public static void p(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static final Object q(mn5 mn5Var, Continuation continuation) {
        Object objD = mn5Var.d(gr9.a, continuation);
        return objD == tx3.a ? objD : e5f.a;
    }

    public static final Object r(mn5 mn5Var, a66 a66Var, Continuation continuation) {
        Object objQ = q(f(M(mn5Var, a66Var), 0, 2), continuation);
        return objQ == tx3.a ? objQ : e5f.a;
    }

    public static final ac s(mn5 mn5Var, mn5 mn5Var2, mn5 mn5Var3, mn5 mn5Var4, g66 g66Var) {
        return new ac(new mn5[]{mn5Var, mn5Var2, mn5Var3, mn5Var4}, 21, g66Var);
    }

    public static final ac t(mn5 mn5Var, mn5 mn5Var2, mn5 mn5Var3, e66 e66Var) {
        return new ac(new mn5[]{mn5Var, mn5Var2, mn5Var3}, 20, e66Var);
    }

    public static final mn5 u(mn5 mn5Var, long j) {
        if (j < 0) {
            throw new IllegalArgumentException("Debounce timeout should not be negative".toString());
        }
        if (j == 0) {
            return mn5Var;
        }
        return new qn5(0, new wo5(new jh2(j, 1), mn5Var, null));
    }

    public static boolean v(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return false;
        }
        boolean z = true;
        for (File file2 : fileArrListFiles) {
            z = v(file2) && z;
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.im4 w(defpackage.mn5 r3, defpackage.a66 r4) {
        /*
            r0 = 2
            defpackage.f8.c(r0, r4)
            pz2 r0 = defpackage.ngg.a
            boolean r1 = r3 instanceof defpackage.im4
            if (r1 == 0) goto L16
            r1 = r3
            im4 r1 = (defpackage.im4) r1
            m56 r2 = r1.b
            if (r2 != r0) goto L16
            a66 r0 = r1.c
            if (r0 != r4) goto L16
            goto L1c
        L16:
            im4 r0 = new im4
            r0.<init>(r3, r4)
            r3 = r0
        L1c:
            im4 r3 = (defpackage.im4) r3
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.od2.w(mn5, a66):im4");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.mn5 x(defpackage.mn5 r4) {
        /*
            boolean r0 = r4 instanceof defpackage.j0e
            if (r0 == 0) goto L5
            goto L21
        L5:
            ai0 r0 = defpackage.ngg.b
            pz2 r1 = defpackage.ngg.a
            boolean r2 = r4 instanceof defpackage.im4
            if (r2 == 0) goto L19
            r2 = r4
            im4 r2 = (defpackage.im4) r2
            m56 r3 = r2.b
            if (r3 != r1) goto L19
            a66 r1 = r2.c
            if (r1 != r0) goto L19
            goto L1f
        L19:
            im4 r1 = new im4
            r1.<init>(r4, r0)
            r4 = r1
        L1f:
            im4 r4 = (defpackage.im4) r4
        L21:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.od2.x(mn5):mn5");
    }

    public static final Object y(mn5 mn5Var, on5 on5Var, Continuation continuation) throws Throwable {
        if (on5Var instanceof jte) {
            throw ((jte) on5Var).a;
        }
        Object objD = mn5Var.d(on5Var, continuation);
        return objD == tx3.a ? objD : e5f.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object z(defpackage.mn5 r5, defpackage.a66 r6, kotlin.coroutines.Continuation r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof defpackage.bq5
            if (r0 == 0) goto L13
            r0 = r7
            bq5 r0 = (defpackage.bq5) r0
            int r1 = r0.s0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s0 = r1
            goto L18
        L13:
            bq5 r0 = new bq5
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.Z
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.s0
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            zp5 r5 = r0.Y
            mec r6 = r0.X
            a66 r0 = r0.o
            a0(r7)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L2d
            goto L64
        L2d:
            r7 = move-exception
            goto L60
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            a0(r7)
            mec r7 = new mec
            r7.<init>()
            kotlinx.coroutines.internal.Symbol r2 = defpackage.ay9.a
            r7.a = r2
            zp5 r2 = new zp5
            r4 = 0
            r2.<init>(r6, r7, r4)
            r0.o = r6     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5b
            r0.X = r7     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5b
            r0.Y = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5b
            r0.s0 = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5b
            java.lang.Object r5 = r5.d(r2, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5b
            if (r5 != r1) goto L58
            goto L6a
        L58:
            r0 = r6
            r6 = r7
            goto L64
        L5b:
            r5 = move-exception
            r0 = r6
            r6 = r7
            r7 = r5
            r5 = r2
        L60:
            java.lang.Object r1 = r7.a
            if (r1 != r5) goto L7f
        L64:
            java.lang.Object r1 = r6.a
            kotlinx.coroutines.internal.Symbol r5 = defpackage.ay9.a
            if (r1 == r5) goto L6b
        L6a:
            return r1
        L6b:
            java.util.NoSuchElementException r5 = new java.util.NoSuchElementException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Expected at least one element matching the predicate "
            r6.<init>(r7)
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L7f:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.od2.z(mn5, a66, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
