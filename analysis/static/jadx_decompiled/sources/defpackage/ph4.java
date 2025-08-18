package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.Choreographer;
import android.view.ViewPropertyAnimator;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import com.google.android.gms.tasks.Task;
import com.google.android.material.datepicker.MaterialCalendar;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.Continuation;
import one.me.sdk.vendor.StoreServicesInfo$ServicesException;
import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.EncodedImage;
import org.webrtc.VideoCodecInfo;
import org.webrtc.VideoCodecStatus;
import org.webrtc.VideoDecoder;
import org.webrtc.VideoDecoderFallback;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public class ph4 implements e9a, a76, q03, ab3, ypa, l3a, h99, VideoDecoder {
    public static final ph4 c = new ph4(1);
    public Object a;
    public Object b;

    public /* synthetic */ ph4(Object obj) {
        this.a = obj;
        this.b = null;
    }

    public static mce k(SpannableString spannableString, int i, rce rceVar) {
        mce mceVar;
        int i2 = 0;
        mce[] mceVarArr = (mce[]) spannableString.getSpans(0, spannableString.length(), mce.class);
        if (mceVarArr != null) {
            int length = mceVarArr.length;
            while (true) {
                if (i2 >= length) {
                    mceVar = null;
                    break;
                }
                mceVar = mceVarArr[i2];
                int spanStart = spannableString.getSpanStart(mceVar);
                int spanEnd = spannableString.getSpanEnd(mceVar);
                if (mceVar.a.a == rceVar.a && spanStart <= i && i <= spanEnd && spanEnd - spanStart > 0) {
                    break;
                }
                i2++;
            }
            if (mceVar != null) {
                return mceVar;
            }
        }
        return null;
    }

    public static o01 s(JSONObject jSONObject) {
        bg1 bg1VarB = bg1.b(jSONObject.optString("initiatorId"));
        if (bg1VarB == null) {
            return null;
        }
        return new o01(bg1VarB, jSONObject.has("movieId") ? Long.valueOf(jSONObject.optLong("movieId")) : null);
    }

    @Override // defpackage.a76
    public /* bridge */ /* synthetic */ void a(Object obj) {
    }

    @Override // defpackage.ab3
    public void b() {
        ib3 ib3Var = (ib3) this.b;
        ib3Var.getClass();
        Object obj = ib3Var.c;
        erd erdVar = (erd) this.a;
        if (obj == null) {
            erdVar.onError(new NullPointerException("The value supplied is null"));
        } else {
            erdVar.a(obj);
        }
    }

    @Override // defpackage.ab3, defpackage.b38, defpackage.erd
    public void c(zl4 zl4Var) {
        ((erd) this.a).c(zl4Var);
    }

    @Override // org.webrtc.VideoDecoder
    public long createNative(long j) {
        return ((VideoDecoder) this.a).createNative(j);
    }

    @Override // defpackage.a76
    public void d(Throwable th) {
        kq0.e();
        l84 l84Var = (l84) this.b;
        x9b x9bVar = (x9b) l84Var.a;
        if (((x9b) this.a) == x9bVar) {
            int i = x9bVar.a;
            y7g y7gVar = (y7g) l84Var.e;
            if (y7gVar != null) {
                y7gVar.c = null;
            }
            l84Var.a = null;
        }
    }

    @Override // org.webrtc.VideoDecoder
    public VideoCodecStatus decode(EncodedImage encodedImage, VideoDecoder.DecodeInfo decodeInfo, long j) {
        return ((VideoDecoder) this.a).decode(encodedImage, decodeInfo, j);
    }

    @Override // defpackage.h99
    public void e(ova ovaVar) {
        ((ConcurrentHashMap) this.a).put(((gy7) this.b).b(ovaVar), ovaVar);
    }

    public gx3 f() {
        return new gx3(this);
    }

    @Override // defpackage.ypa
    public Object g(Uri uri, w24 w24Var) {
        nk5 nk5Var = (nk5) ((ypa) this.a).g(uri, w24Var);
        List list = (List) this.b;
        return (list == null || list.isEmpty()) ? nk5Var : (nk5) nk5Var.a(list);
    }

    @Override // org.webrtc.VideoDecoder
    public String getImplementationName() {
        VideoDecoder videoDecoder = (VideoDecoder) this.a;
        return videoDecoder instanceof VideoDecoderFallback ? "VideoDecoderFallback" : videoDecoder.getImplementationName();
    }

    public void h() {
        ViewPropertyAnimator viewPropertyAnimator = (ViewPropertyAnimator) this.a;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            return;
        }
        Animation animation = (Animation) this.b;
        if (animation != null) {
            animation.cancel();
        }
    }

    public void i(n54 n54Var) {
        synchronized (n54Var) {
        }
        Handler handler = (Handler) this.a;
        if (handler != null) {
            handler.post(new y60(this, n54Var, 1));
        }
    }

    @Override // org.webrtc.VideoDecoder
    public VideoCodecStatus initDecode(VideoDecoder.Settings settings, VideoDecoder.Callback callback) {
        ((a4c) this.b).log("VideoDecoderLifecycleLogger", "initDecode(cores=" + settings.numberOfCores + ", size=" + settings.width + "x" + settings.height + ")");
        return ((VideoDecoder) this.a).initDecode(settings, callback);
    }

    public byte[] j(d45 d45Var) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) this.a;
        byteArrayOutputStream.reset();
        DataOutputStream dataOutputStream = (DataOutputStream) this.b;
        try {
            dataOutputStream.writeBytes(d45Var.a);
            dataOutputStream.writeByte(0);
            String str = d45Var.b;
            if (str == null) {
                str = "";
            }
            dataOutputStream.writeBytes(str);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeLong(d45Var.c);
            dataOutputStream.writeLong(d45Var.o);
            dataOutputStream.write(d45Var.X);
            dataOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // defpackage.l3a
    public void l(Task task) {
        Exception excE = task.e();
        if (excE != null) {
            hm9.p(((xe6) this.b).b, "fail deletePushToken", new StoreServicesInfo$ServicesException("failure to delete token", excE));
        }
        ((Continuation) this.a).resumeWith(e5f.a);
    }

    public File m() {
        if (((File) this.a) == null) {
            synchronized (this) {
                try {
                    if (((File) this.a) == null) {
                        fl5 fl5Var = (fl5) this.b;
                        fl5Var.a();
                        this.a = new File(fl5Var.a.getFilesDir(), "PersistedInstallation." + ((fl5) this.b).c() + ".json");
                    }
                } finally {
                }
            }
        }
        return (File) this.a;
    }

    public ArrayList n(String str) {
        xlc xlcVarA = xlc.a(1, "SELECT work_spec_id FROM dependency WHERE prerequisite_id=?");
        if (str == null) {
            xlcVarA.W(1);
        } else {
            xlcVarA.f(1, str);
        }
        ilc ilcVar = (ilc) this.a;
        ilcVar.b();
        Cursor cursorO = ilcVar.o(xlcVarA, null);
        try {
            ArrayList arrayList = new ArrayList(cursorO.getCount());
            while (cursorO.moveToNext()) {
                arrayList.add(cursorO.isNull(0) ? null : cursorO.getString(0));
            }
            return arrayList;
        } finally {
            cursorO.close();
            xlcVarA.n();
        }
    }

    public la5 o(Object... objArr) {
        Constructor constructorA;
        synchronized (((AtomicBoolean) this.b)) {
            if (!((AtomicBoolean) this.b).get()) {
                try {
                    constructorA = ((ta4) this.a).a();
                } catch (ClassNotFoundException unused) {
                    ((AtomicBoolean) this.b).set(true);
                } catch (Exception e) {
                    throw new RuntimeException("Error instantiating extension", e);
                }
            }
            constructorA = null;
        }
        if (constructorA == null) {
            return null;
        }
        try {
            return (la5) constructorA.newInstance(objArr);
        } catch (Exception e2) {
            throw new IllegalStateException("Unexpected error creating extractor", e2);
        }
    }

    @Override // defpackage.ab3, defpackage.b38, defpackage.erd
    public void onError(Throwable th) {
        ((erd) this.a).onError(th);
    }

    public List p(CharSequence charSequence) {
        if (charSequence == null || w9e.C0(charSequence)) {
            return nz4.a;
        }
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) this.b;
        spannableStringBuilder.clear();
        spannableStringBuilder.clearSpans();
        spannableStringBuilder.append(charSequence);
        Object[] spans = spannableStringBuilder.getSpans(0, charSequence.length(), qu8.class);
        ArrayList arrayList = new ArrayList();
        for (Object obj : spans) {
            if (((qu8) obj).a.c == mu8.a) {
                arrayList.add(obj);
            }
        }
        return x53.D0(arrayList);
    }

    public boolean q(String str) {
        xlc xlcVarA = xlc.a(1, "SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)");
        if (str == null) {
            xlcVarA.W(1);
        } else {
            xlcVarA.f(1, str);
        }
        ilc ilcVar = (ilc) this.a;
        ilcVar.b();
        Cursor cursorO = ilcVar.o(xlcVarA, null);
        try {
            boolean z = false;
            if (cursorO.moveToFirst()) {
                z = cursorO.getInt(0) != 0;
            }
            return z;
        } finally {
            cursorO.close();
            xlcVarA.n();
        }
    }

    public void r(hb0 hb0Var) throws IOException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", hb0Var.a);
            jSONObject.put("Status", au1.s(hb0Var.b));
            jSONObject.put("AuthToken", hb0Var.c);
            jSONObject.put("RefreshToken", hb0Var.d);
            jSONObject.put("TokenCreationEpochInSecs", hb0Var.f);
            jSONObject.put("ExpiresInSecs", hb0Var.e);
            jSONObject.put("FisError", hb0Var.g);
            fl5 fl5Var = (fl5) this.b;
            fl5Var.a();
            File fileCreateTempFile = File.createTempFile("PersistedInstallation", "tmp", fl5Var.a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (fileCreateTempFile.renameTo(m())) {
            } else {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    @Override // org.webrtc.VideoDecoder
    public VideoCodecStatus release() {
        ((a4c) this.b).log("VideoDecoderLifecycleLogger", "release()");
        return ((VideoDecoder) this.a).release();
    }

    public hb0 t() throws IOException {
        JSONObject jSONObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(m());
            while (true) {
                try {
                    int i = fileInputStream.read(bArr, 0, 16384);
                    if (i < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i);
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        }
        String strOptString = jSONObject.optString("Fid", null);
        int iOptInt = jSONObject.optInt("Status", 0);
        String strOptString2 = jSONObject.optString("AuthToken", null);
        String strOptString3 = jSONObject.optString("RefreshToken", null);
        long jOptLong = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
        long jOptLong2 = jSONObject.optLong("ExpiresInSecs", 0L);
        String strOptString4 = jSONObject.optString("FisError", null);
        int i2 = au1.v(5)[iOptInt];
        if (i2 == 0) {
            throw new NullPointerException("Null registrationStatus");
        }
        Long lValueOf = Long.valueOf(jOptLong);
        Long lValueOf2 = Long.valueOf(jOptLong2);
        String str = i2 == 0 ? " registrationStatus" : "";
        if (str.isEmpty()) {
            return new hb0(i2, lValueOf2.longValue(), lValueOf.longValue(), strOptString, strOptString2, strOptString3, strOptString4);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public void u(final kp kpVar) {
        if (this == c) {
            kpVar.r();
            kpVar.p();
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = (ViewPropertyAnimator) this.a;
        if (viewPropertyAnimator != null) {
            final int i = 0;
            viewPropertyAnimator.withStartAction(new Runnable() { // from class: kg
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i) {
                        case 0:
                            kpVar.r();
                            break;
                        default:
                            kpVar.p();
                            break;
                    }
                }
            });
            final int i2 = 1;
            viewPropertyAnimator.withEndAction(new Runnable() { // from class: kg
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i2) {
                        case 0:
                            kpVar.r();
                            break;
                        default:
                            kpVar.p();
                            break;
                    }
                }
            });
            return;
        }
        Animation animation = (Animation) this.b;
        if (animation != null) {
            animation.setAnimationListener(new ng(4, kpVar));
        }
    }

    public /* synthetic */ ph4(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public /* synthetic */ ph4(Object obj, Object obj2, boolean z) {
        this.b = obj;
        this.a = obj2;
    }

    public ph4(VideoDecoder videoDecoder, VideoCodecInfo videoCodecInfo, a4c a4cVar) {
        this.a = videoDecoder;
        this.b = a4cVar;
        try {
            if (videoDecoder instanceof VideoDecoderFallback) {
                a4cVar.log("VideoDecoderLifecycleLogger", "createDecoder(VideoDecoderFallback), codec: " + videoCodecInfo);
            } else {
                a4cVar.log("VideoDecoderLifecycleLogger", "createDecoder(" + videoDecoder.getImplementationName() + "), codec: " + videoCodecInfo);
            }
        } catch (Throwable th) {
            a4cVar.logException("VideoDecoderLifecycleLogger", "createDecoder failed to read implementation name from " + videoDecoder.getClass().getName() + ", codec: " + videoCodecInfo, th);
        }
    }

    public ph4(ilc ilcVar, int i) {
        switch (i) {
            case 23:
                this.a = ilcVar;
                this.b = Collections.newSetFromMap(new IdentityHashMap());
                break;
            default:
                this.a = ilcVar;
                this.b = new sh(ilcVar, 5);
                break;
        }
    }

    public ph4(TranslateAnimation translateAnimation) {
        this.a = null;
        this.b = translateAnimation;
    }

    public ph4(int i) {
        switch (i) {
            case 3:
                this.a = Choreographer.getInstance();
                this.b = Looper.myLooper();
                break;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                this.a = new LinkedHashMap();
                break;
            case 18:
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
                this.a = byteArrayOutputStream;
                this.b = new DataOutputStream(byteArrayOutputStream);
                break;
            default:
                this.a = null;
                this.b = null;
                break;
        }
    }

    public ph4(gy7 gy7Var) {
        this.a = new ConcurrentHashMap();
        this.b = gy7Var;
    }

    public ph4(Context context, int i) throws Resources.NotFoundException {
        switch (i) {
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                this.a = context;
                break;
            default:
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(kq0.G(tsb.materialCalendarStyle, context, MaterialCalendar.class.getCanonicalName()).data, z2c.MaterialCalendar);
                rq9.n(context, typedArrayObtainStyledAttributes.getResourceId(z2c.MaterialCalendar_dayStyle, 0));
                rq9.n(context, typedArrayObtainStyledAttributes.getResourceId(z2c.MaterialCalendar_dayInvalidStyle, 0));
                rq9.n(context, typedArrayObtainStyledAttributes.getResourceId(z2c.MaterialCalendar_daySelectedStyle, 0));
                rq9.n(context, typedArrayObtainStyledAttributes.getResourceId(z2c.MaterialCalendar_dayTodayStyle, 0));
                ColorStateList colorStateListQ = ju0.q(context, typedArrayObtainStyledAttributes, z2c.MaterialCalendar_rangeFillColor);
                this.a = rq9.n(context, typedArrayObtainStyledAttributes.getResourceId(z2c.MaterialCalendar_yearStyle, 0));
                rq9.n(context, typedArrayObtainStyledAttributes.getResourceId(z2c.MaterialCalendar_yearSelectedStyle, 0));
                this.b = rq9.n(context, typedArrayObtainStyledAttributes.getResourceId(z2c.MaterialCalendar_yearTodayStyle, 0));
                new Paint().setColor(colorStateListQ.getDefaultColor());
                typedArrayObtainStyledAttributes.recycle();
                break;
        }
    }

    public ph4(ta4 ta4Var) {
        this.a = ta4Var;
        this.b = new AtomicBoolean(false);
    }

    public ph4(Bundle bundle) {
        this.a = "androidx.media3.session.MediaLibraryService";
        this.b = bundle;
    }
}
