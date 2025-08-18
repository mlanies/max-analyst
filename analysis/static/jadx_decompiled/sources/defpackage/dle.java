package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.content.res.XmlResourceParser;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlin.NoWhenBranchMatchedException;
import org.webrtc.CameraEnumerationAndroid;
import org.webrtc.CameraEnumerator;
import org.webrtc.CameraVideoCapturer;

/* loaded from: classes2.dex */
public abstract class dle implements CameraEnumerator {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public static float J(int i, int i2, int i3) {
        return (i - i2) / i3;
    }

    public abstract IntentFilter A();

    public void B(RecyclerView recyclerView) {
        hdc hdcVar = (hdc) this.c;
        if (hdcVar == null && ((jdc) this.b) == null) {
            return;
        }
        if (hdcVar != null && recyclerView.getAdapter() != ((hdc) this.c)) {
            hm9.l0(getClass().getName(), "adapter was changed! cached adapter = " + ((hdc) this.c) + ", recyclerView.adapter = " + recyclerView.getAdapter(), new IllegalStateException("adapter was changed"));
        }
        hdc hdcVar2 = (hdc) this.c;
        jdc jdcVar = (jdc) this.b;
        if (hdcVar2 != null && jdcVar != null) {
            hdcVar2.B(jdcVar);
        }
        this.c = null;
        this.b = null;
    }

    public Object C(Context context, XmlResourceParser xmlResourceParser) {
        Integer num = (Integer) s36.d(xmlResourceParser).get(((vg) this.b).a);
        return num != null ? z(context, xmlResourceParser, num.intValue()) : this.c;
    }

    public abstract int D();

    public abstract CameraCharacteristics E(String str);

    public ArrayList F() {
        ArrayList arrayList = new ArrayList();
        for (String str : getDeviceNames()) {
            List<CameraEnumerationAndroid.CaptureFormat> supportedFormats = H().getSupportedFormats(str);
            arrayList.add(isFrontFacing(str) ? new uw1(str, supportedFormats) : isBackFacing(str) ? new tw1(str, supportedFormats) : new vw1(str, supportedFormats));
        }
        return arrayList;
    }

    public Set G() {
        return Collections.emptySet();
    }

    public abstract CameraEnumerator H();

    public ww1 I(int i) {
        ArrayList arrayListF = F();
        int i2 = zh0.$EnumSwitchMapping$0[au1.s(i)];
        Object obj = null;
        if (i2 == 1) {
            Iterator it = arrayListF.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((ww1) next) instanceof uw1) {
                    obj = next;
                    break;
                }
            }
            return (ww1) obj;
        }
        if (i2 == 2) {
            Iterator it2 = arrayListF.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                if (((ww1) next2) instanceof tw1) {
                    obj = next2;
                    break;
                }
            }
            return (ww1) obj;
        }
        if (i2 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        Iterator it3 = arrayListF.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            Object next3 = it3.next();
            if (((ww1) next3) instanceof vw1) {
                obj = next3;
                break;
            }
        }
        return (ww1) obj;
    }

    public int K() {
        if (((je7) this.c).a()) {
            return Q().getMeasuredHeight();
        }
        return 0;
    }

    public int L() {
        if (((je7) this.c).a()) {
            return Q().getMeasuredWidth();
        }
        return 0;
    }

    public MenuItem M(MenuItem menuItem) {
        if (!(menuItem instanceof vde)) {
            return menuItem;
        }
        vde vdeVar = (vde) menuItem;
        if (((qpd) this.c) == null) {
            this.c = new qpd();
        }
        MenuItem menuItem2 = (MenuItem) ((qpd) this.c).get(vdeVar);
        if (menuItem2 != null) {
            return menuItem2;
        }
        fr8 fr8Var = new fr8((Context) this.b, vdeVar);
        ((qpd) this.c).put(vdeVar, fr8Var);
        return fr8Var;
    }

    public short N() {
        return ((sla) this.c).a;
    }

    public int O() {
        return ((HashMap) this.b).hashCode();
    }

    public ele P() {
        return ele.c0;
    }

    public View Q() {
        return (View) ((je7) this.c).getValue();
    }

    public View R() {
        if (((je7) this.c).a()) {
            return Q();
        }
        return null;
    }

    public abstract void S();

    public void T(int i, int i2) {
        je7 je7Var = (je7) this.c;
        if (je7Var.a()) {
            ote.E(Q(), i, i2, 0, 12);
        }
    }

    public void U(int i, int i2) {
        je7 je7Var = (je7) this.c;
        if (je7Var.a()) {
            ((View) je7Var.getValue()).measure(i, i2);
        }
    }

    public boolean V() {
        return !(this instanceof x70);
    }

    public abstract jdc W(RecyclerView recyclerView, hdc hdcVar);

    public abstract void X();

    public void Y(View view) {
    }

    public abstract void Z(String str, Executor executor, CameraDevice.StateCallback stateCallback);

    public abstract void a0(rj0 rj0Var);

    public abstract void b0(q6d q6dVar, yt1 yt1Var);

    public abstract void c0();

    @Override // org.webrtc.CameraEnumerator
    public CameraVideoCapturer createCapturer(String str, CameraVideoCapturer.CameraEventsHandler cameraEventsHandler, CameraVideoCapturer.CaptureFormatHelper captureFormatHelper) {
        try {
            return H().createCapturer(str, cameraEventsHandler, captureFormatHelper);
        } catch (Exception e) {
            String message = e.getMessage();
            if (message == null) {
                message = "camera error";
            }
            ((a4c) this.b).reportException((String) this.c, message, e);
            return null;
        }
    }

    public void d(String str, boolean z) {
        ((HashMap) this.b).put(str, Boolean.valueOf(z));
    }

    public void d0() {
        y();
        IntentFilter intentFilterA = A();
        if (intentFilterA.countActions() == 0) {
            return;
        }
        if (((an) this.b) == null) {
            this.b = new an(0, this);
        }
        ((dn) this.c).v0.registerReceiver((an) this.b, intentFilterA);
    }

    public void e(int i, String str) {
        ((HashMap) this.b).put(str, Integer.valueOf(i));
    }

    public abstract void e0();

    public abstract void f0();

    public void g(String str, List list) {
        ((HashMap) this.b).put(str, list);
    }

    public abstract void g0(CameraManager.AvailabilityCallback availabilityCallback);

    @Override // org.webrtc.CameraEnumerator
    public String[] getDeviceNames() {
        return H().getDeviceNames();
    }

    @Override // org.webrtc.CameraEnumerator
    public List getSupportedFormats(String str) {
        return H().getSupportedFormats(str);
    }

    public void h(String str, long[] jArr) {
        ((HashMap) this.b).put(str, jArr);
    }

    public void i(long j, String str) {
        ((HashMap) this.b).put(str, Long.valueOf(j));
    }

    @Override // org.webrtc.CameraEnumerator
    public boolean isBackFacing(String str) {
        return H().isBackFacing(str);
    }

    @Override // org.webrtc.CameraEnumerator
    public boolean isFrontFacing(String str) {
        return H().isFrontFacing(str);
    }

    public void n(String str, Map map) {
        ((HashMap) this.b).put(str, map);
    }

    public void p(String str, String str2) {
        ((HashMap) this.b).put(str, str2);
    }

    public void t() {
        ViewGroup viewGroup = (ViewGroup) this.b;
        if (viewGroup == null) {
            viewGroup = null;
        }
        ay7.a(viewGroup, Q(), new ViewGroup.LayoutParams(-2, -2));
        Q().setVisibility(0);
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return s5c.T((HashMap) this.b);
            default:
                return super.toString();
        }
    }

    public void v(RecyclerView recyclerView) {
        B(recyclerView);
        hdc adapter = recyclerView.getAdapter();
        if (adapter == null) {
            throw new IllegalArgumentException("require not null adapter".toString());
        }
        this.c = adapter;
        jdc jdcVarW = W(recyclerView, adapter);
        this.b = jdcVarW;
        adapter.z(jdcVarW);
    }

    public boolean w() {
        return this instanceof rf9;
    }

    public abstract void x();

    public void y() {
        an anVar = (an) this.b;
        if (anVar != null) {
            try {
                ((dn) this.c).v0.unregisterReceiver(anVar);
            } catch (IllegalArgumentException unused) {
            }
            this.b = null;
        }
    }

    public abstract Object z(Context context, XmlResourceParser xmlResourceParser, int i);

    public /* synthetic */ dle(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public dle(a4c a4cVar) {
        this.a = 4;
        this.b = a4cVar;
        this.c = getClass().getSimpleName();
    }

    @Override // org.webrtc.CameraEnumerator
    public CameraVideoCapturer createCapturer(String str, CameraVideoCapturer.CameraEventsHandler cameraEventsHandler) {
        try {
            return H().createCapturer(str, cameraEventsHandler);
        } catch (Exception e) {
            String message = e.getMessage();
            if (message == null) {
                message = "camera error";
            }
            ((a4c) this.b).reportException((String) this.c, message, e);
            return null;
        }
    }

    public dle(m56 m56Var) {
        this.a = 6;
        this.c = tu0.r(3, new x2(m56Var, 5, this));
    }

    public dle(sla slaVar) {
        this.a = 0;
        this.b = new HashMap();
        this.c = slaVar;
    }

    public dle(Context context) {
        this.a = 5;
        this.b = context;
    }

    public dle(int i) {
        this.a = 9;
        this.c = new ArrayList();
        for (int i2 = 0; i2 < i; i2++) {
            ((ArrayList) this.c).add(new vq4());
        }
    }

    public dle(CameraDevice cameraDevice, tfg tfgVar) {
        this.a = 7;
        cameraDevice.getClass();
        this.b = cameraDevice;
        this.c = tfgVar;
    }

    public dle(Context context, z7 z7Var) {
        this.a = 8;
        this.b = (CameraManager) context.getSystemService("camera");
        this.c = z7Var;
    }

    public dle(dn dnVar) {
        this.a = 2;
        this.c = dnVar;
    }
}
