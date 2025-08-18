package defpackage;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraDevice;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.SystemClock;
import android.view.MenuItem;
import android.view.Surface;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.camera.camera2.internal.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk;
import androidx.fragment.app.a;
import androidx.fragment.app.c;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.exoplayer.video.VideoSink$VideoSinkException;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.inject.Provider;
import one.me.calls.ui.ui.call.CallScreen;
import one.me.calls.ui.ui.pip.PipScreen;
import one.me.chatmedia.viewer.photo.GifViewerWidget;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public class rxd implements uq8, y2a, t70, ye1, xo1, qj3, xha, i6d, Provider, cj9, abe, e8, tlf, vt, hlf, agf, q1b, cx1 {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ rxd(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public static hqd V(rxd rxdVar, Context context, int i) {
        rxdVar.getClass();
        int i2 = tga.j;
        w2e w2eVar = (w2e) rxdVar.b;
        return i == i2 ? new jw7(context, w2eVar, 81, 2) : i == tga.i ? new jw7(context, w2eVar, 81, 0) : new jw7(context, w2eVar, 81, 1);
    }

    @Override // defpackage.vt
    public xt B(lv4 lv4Var, Looper looper, wt wtVar, md3 md3Var) {
        return new xt6(lv4Var, wtVar, (v24) ((ao0) this.b), md3Var.a);
    }

    @Override // defpackage.i6d
    public boolean C(long j) {
        boolean zC;
        boolean z = false;
        do {
            long jF = f();
            if (jF == Long.MIN_VALUE) {
                break;
            }
            zC = false;
            for (i6d i6dVar : (i6d[]) this.b) {
                long jF2 = i6dVar.f();
                boolean z2 = jF2 != Long.MIN_VALUE && jF2 <= j;
                if (jF2 == jF || z2) {
                    zC |= i6dVar.C(j);
                }
            }
            z |= zC;
        } while (zC);
        return z;
    }

    @Override // defpackage.cj9
    public fj9 D(String str) {
        return new o9g(13, ((lh4) this.b).D(str));
    }

    @Override // defpackage.hlf
    public void E(VideoSink$VideoSinkException videoSink$VideoSinkException) {
        t88 t88Var = (t88) this.b;
        t88Var.K1 = t88Var.e(videoSink$VideoSinkException, videoSink$VideoSinkException.a, false, 7001);
    }

    @Override // defpackage.agf
    public void F(long j) {
        if (j == 0) {
            ((m1f) this.b).G0 = true;
        }
        ((m1f) this.b).F0 = j;
    }

    @Override // defpackage.tlf
    public void G(Surface surface) {
        String str = ((GifViewerWidget) this.b).a;
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, str, "Media viewer. Video viewer, set surface " + surface, null);
        }
        dkf dkfVarP0 = ((GifViewerWidget) this.b).p0();
        if (dkfVarP0 != null) {
            dkfVarP0.M0(surface);
        }
    }

    @Override // defpackage.xo1
    public void H(gg1 gg1Var) {
        g71 g71Var;
        switch (this.a) {
            case 5:
                l71 l71Var = ((m71) this.b).J0;
                if (l71Var != null && (g71Var = ((h71) ((qqd) l71Var).b).O0) != null) {
                    yxc yxcVar = CallScreen.R0;
                    CallScreen callScreen = ((ki1) g71Var).a;
                    if (callScreen.D0().q(callScreen.z0().g)) {
                        CallScreen.q0(callScreen);
                        break;
                    }
                }
                break;
            default:
                km1 km1Var = ((mm1) this.b).Y0;
                if (km1Var != null) {
                    yxc yxcVar2 = CallScreen.R0;
                    el1 el1VarD0 = ((ui1) km1Var).a.D0();
                    la1 la1VarS = el1VarD0.s();
                    Map map = (Map) el1VarD0.D0.getValue();
                    boolean z = la1VarS.g;
                    gg1 gg1Var2 = ((to1) el1VarD0.w0.a.getValue()).b;
                    Object obj = null;
                    if (z) {
                        gg1Var2 = null;
                    } else if (la1VarS.m) {
                        Iterator it = map.keySet().iterator();
                        while (true) {
                            if (it.hasNext()) {
                                Object next = it.next();
                                if (!tpa.f((gg1) next, gg1Var2)) {
                                    obj = next;
                                }
                            }
                        }
                        gg1Var2 = (gg1) obj;
                    }
                    el1VarD0.c.j(gg1Var2);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.xha
    public void I(yha yhaVar) {
        ((cnd) ((tt2) this.b)).b.invoke(yhaVar);
    }

    @Override // defpackage.agf
    public void K() {
        m1f m1fVar = (m1f) this.b;
        m1fVar.C0 = true;
        m1fVar.b();
    }

    @Override // defpackage.hlf
    public void M() {
        ((t88) this.b).L0(0, 1);
    }

    @Override // defpackage.tlf
    public int M0() {
        gef gefVar = ((GifViewerWidget) this.b).s0;
        if (gefVar != null) {
            return gefVar.getHeight();
        }
        return 0;
    }

    @Override // defpackage.xo1
    public void N() {
        g71 g71Var;
        switch (this.a) {
            case 5:
                l71 l71Var = ((m71) this.b).J0;
                if (l71Var != null && (g71Var = ((h71) ((qqd) l71Var).b).O0) != null) {
                    yxc yxcVar = CallScreen.R0;
                    ((ki1) g71Var).a.D0().Z.e();
                    break;
                }
                break;
            default:
                km1 km1Var = ((mm1) this.b).Y0;
                if (km1Var != null) {
                    yxc yxcVar2 = CallScreen.R0;
                    ((ui1) km1Var).a.D0().Z.e();
                    break;
                }
                break;
        }
    }

    @Override // defpackage.agf
    public void O() {
        ((m1f) this.b).Y.execute(new nn6(16, this));
    }

    @Override // defpackage.y2a
    public x6g P(View view, x6g x6gVar) {
        fm fmVar = (fm) this.b;
        fmVar.getClass();
        WeakHashMap weakHashMap = zmf.a;
        x6g x6gVar2 = fmVar.getFitsSystemWindows() ? x6gVar : null;
        if (!Objects.equals(fmVar.u0, x6gVar2)) {
            fmVar.u0 = x6gVar2;
            fmVar.setWillNotDraw(!(fmVar.J0 != null && fmVar.getTopInset() > 0));
            fmVar.requestLayout();
        }
        return x6gVar;
    }

    @Override // defpackage.uq8
    public void Q(wq8 wq8Var) {
        uq8 uq8Var = ((ActionMenuView) this.b).u0;
        if (uq8Var != null) {
            uq8Var.Q(wq8Var);
        }
    }

    @Override // defpackage.tlf
    public int R() {
        gef gefVar = ((GifViewerWidget) this.b).s0;
        if (gefVar != null) {
            return gefVar.getWidth();
        }
        return 0;
    }

    @Override // defpackage.xo1
    public void S(gg1 gg1Var) {
        g71 g71Var;
        switch (this.a) {
            case 5:
                l71 l71Var = ((m71) this.b).J0;
                if (l71Var != null && (g71Var = ((h71) ((qqd) l71Var).b).O0) != null) {
                    yxc yxcVar = CallScreen.R0;
                    ((ki1) g71Var).a.D0().v(gg1Var);
                    break;
                }
                break;
            default:
                km1 km1Var = ((mm1) this.b).Y0;
                if (km1Var != null) {
                    yxc yxcVar2 = CallScreen.R0;
                    ((ui1) km1Var).a.D0().v(gg1Var);
                    break;
                }
                break;
        }
    }

    public y8 T(h08 h08Var) {
        lfg jfgVar;
        g08 g08Var = h08Var.a;
        y7g y7gVar = (y7g) this.b;
        y7gVar.getClass();
        try {
            fp3.o(g08Var, "MarkerOptions must not be null.");
            eig eigVar = (eig) y7gVar.b;
            Parcel parcelG0 = eigVar.G0();
            agg.b(parcelG0, g08Var);
            Parcel parcelR = eigVar.R(parcelG0, 11);
            IBinder strongBinder = parcelR.readStrongBinder();
            int i = kfg.d;
            Object hcVar = null;
            if (strongBinder == null) {
                jfgVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                jfgVar = iInterfaceQueryLocalInterface instanceof lfg ? (lfg) iInterfaceQueryLocalInterface : new jfg(strongBinder, "com.google.android.gms.maps.model.internal.IMarkerDelegate", 3);
            }
            parcelR.recycle();
            if (jfgVar != null) {
                hcVar = g08Var.B0 == 1 ? new hc(jfgVar) : new b08(jfgVar);
            }
            return new y8(hcVar);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public void U() {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList(((HashMap) this.b).values());
            ((HashMap) this.b).clear();
        }
        for (int i = 0; i < arrayList.size(); i++) {
            g05 g05Var = (g05) arrayList.get(i);
            if (g05Var != null) {
                g05Var.close();
            }
        }
    }

    public synchronized g05 W(tpd tpdVar) {
        g05 g05VarA = (g05) ((HashMap) this.b).get(tpdVar);
        if (g05VarA != null) {
            synchronized (g05VarA) {
                if (!g05.m0(g05VarA)) {
                    ((HashMap) this.b).remove(tpdVar);
                    ta5.j(rxd.class, "Found closed reference %d for key %s (%d)", Integer.valueOf(System.identityHashCode(g05VarA)), tpdVar.a, Integer.valueOf(System.identityHashCode(tpdVar)));
                    return null;
                }
                g05VarA = g05.a(g05VarA);
            }
        }
        return g05VarA;
    }

    public o9g X() {
        y7g y7gVar = (y7g) this.b;
        y7gVar.getClass();
        try {
            eig eigVar = (eig) y7gVar.b;
            Parcel parcelR = eigVar.R(eigVar.G0(), 1);
            Parcelable.Creator<CameraPosition> creator = CameraPosition.CREATOR;
            int i = agg.a;
            CameraPosition cameraPositionCreateFromParcel = parcelR.readInt() == 0 ? null : creator.createFromParcel(parcelR);
            parcelR.recycle();
            return new o9g(7, cameraPositionCreateFromParcel);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public int Y() {
        y7g y7gVar = (y7g) this.b;
        y7gVar.getClass();
        try {
            eig eigVar = (eig) y7gVar.b;
            Parcel parcelR = eigVar.R(eigVar.G0(), 15);
            int i = parcelR.readInt();
            parcelR.recycle();
            if (i == 0) {
                return 0;
            }
            if (i == 1) {
                return 1;
            }
            int i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    i2 = 4;
                    if (i != 4) {
                        throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Unknown google map type = %d", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1)));
                    }
                }
            }
            return i2;
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public void Z() {
        View view = (View) this.b;
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    @Override // defpackage.i6d
    public boolean a() {
        for (i6d i6dVar : (i6d[]) this.b) {
            if (i6dVar.a()) {
                return true;
            }
        }
        return false;
    }

    public synchronized void a0() {
        ta5.d(rxd.class, Integer.valueOf(((HashMap) this.b).size()), "Count = %d");
    }

    @Override // defpackage.qj3
    public void accept(Object obj) {
        switch (this.a) {
            case 8:
                v6f v6fVar = (v6f) obj;
                s12 s12Var = (s12) this.b;
                s12Var.getClass();
                if (v6fVar.a()) {
                    String str = v6fVar.h.a;
                    e8d e8dVar = s12Var.a;
                    if (e8dVar == null) {
                        e8dVar = null;
                    }
                    jz2 jz2Var = (jz2) ((iy2) e8dVar.J.getValue());
                    long j = s12Var.o;
                    e52 e52Var = (e52) jz2Var.m(j).a.getValue();
                    if (e52Var == null) {
                        hm9.p(s12Var.Z, ey8.h(j, "updateChatAvatar: chat not found, chatId="), null);
                        s12Var.y();
                        break;
                    } else {
                        tq2 tq2Var = new tq2(e52Var.b.a, 0, null, false, null, null, null, str, s12Var.X, null, false, 0L);
                        hc3 hc3Var = s12Var.s0;
                        if (hc3Var != null) {
                            drd drdVarK = ((k4a) s12Var.a()).K(tq2Var, ((jle) s12Var.q()).a());
                            e8d e8dVar2 = s12Var.a;
                            if (e8dVar2 == null) {
                                e8dVar2 = null;
                            }
                            fme fmeVar = (fme) e8dVar2.I.getValue();
                            fmeVar.getClass();
                            ds5 ds5VarJ = drdVarK.j(new dme(fmeVar, 3, 0));
                            iq1 iq1Var = new iq1(new y8(s12Var), 2, new bkg(7, s12Var));
                            ds5VarJ.k(iq1Var);
                            hc3Var.a(iq1Var);
                            break;
                        }
                    }
                }
                break;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                r44 r44Var = (r44) this.b;
                r44Var.getClass();
                r44Var.b.run();
                break;
            default:
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    ((dg5) ((jy8) this.b).c.getValue()).d((iy8) it.next());
                }
                break;
        }
    }

    @Override // defpackage.q1b
    public void b() {
        PipScreen pipScreen = (PipScreen) this.b;
        if (!pipScreen.getRouter().n()) {
            pipScreen.requireActivity().finish();
            return;
        }
        im imVarRequireActivity = pipScreen.requireActivity();
        Intent intent = new Intent(pipScreen.requireActivity(), pipScreen.requireActivity().getClass());
        intent.setFlags(131072);
        imVarRequireActivity.startActivity(intent);
    }

    public void b0(pw1 pw1Var) {
        urb urbVar = ((rrb) this.b).o;
        if (urbVar == null) {
            urbVar = null;
        }
        urbVar.getClass();
        hm9.q("QuickCameraViewModel", "onCameraError", pw1Var);
    }

    @Override // defpackage.agf
    public void c(VideoFrameProcessingException videoFrameProcessingException) {
        m1f m1fVar = (m1f) this.b;
        m1fVar.getClass();
        m1fVar.Y.execute(new vs5(m1fVar, 28, videoFrameProcessingException));
    }

    public synchronized void c0(ww0 ww0Var, g05 g05Var) {
        ww0Var.getClass();
        if (!g05.m0(g05Var)) {
            throw new IllegalArgumentException();
        }
        g05.d((g05) ((HashMap) this.b).put(ww0Var, g05.a(g05Var)));
        a0();
    }

    @Override // defpackage.ye1, defpackage.ul1
    public void d() {
        g71 g71Var;
        l71 l71Var = ((m71) this.b).J0;
        if (l71Var == null || (g71Var = ((h71) ((qqd) l71Var).b).O0) == null) {
            return;
        }
        yxc yxcVar = CallScreen.R0;
        CallScreen callScreen = ((ki1) g71Var).a;
        callScreen.y0().d(3, 2);
        String str = o37.a;
        o37.d(callScreen.getContext(), c37.D(callScreen.D0().s().k), null);
    }

    public synchronized void d0(ww0 ww0Var, g05 g05Var) {
        ww0Var.getClass();
        g05Var.getClass();
        if (!g05.m0(g05Var)) {
            throw new IllegalArgumentException();
        }
        g05 g05Var2 = (g05) ((HashMap) this.b).get(ww0Var);
        if (g05Var2 == null) {
            return;
        }
        o43 o43VarO = o43.o(g05Var2.a);
        o43 o43VarO2 = o43.o(g05Var.a);
        if (o43VarO != null && o43VarO2 != null) {
            try {
                if (o43VarO.e0() == o43VarO2.e0()) {
                    ((HashMap) this.b).remove(ww0Var);
                    o43.S(o43VarO2);
                    o43.S(o43VarO);
                    g05.d(g05Var2);
                    a0();
                }
            } finally {
                o43.S(o43VarO2);
                o43.S(o43VarO);
                g05.d(g05Var2);
            }
        }
    }

    @Override // defpackage.ye1, defpackage.ul1
    public void e() {
        g71 g71Var;
        int i = 3;
        l71 l71Var = ((m71) this.b).J0;
        if (l71Var == null || (g71Var = ((h71) ((qqd) l71Var).b).O0) == null) {
            return;
        }
        yxc yxcVar = CallScreen.R0;
        CallScreen callScreen = ((ki1) g71Var).a;
        callScreen.y0().d(1, 2);
        tpa.o(callScreen.getContext(), c37.D(callScreen.D0().s().k));
        if (tpa.s()) {
            String string = callScreen.getContext().getString(f0c.call_link_share_dialog_share_link_copy);
            wha whaVar = new wha(callScreen);
            whaVar.h(string);
            whaVar.d(new ho1(i, null));
            int i2 = 0;
            whaVar.c(new eia(i2, i2, i2, i));
            whaVar.i();
        }
    }

    public void e0(boolean z) {
        y7g y7gVar = (y7g) this.b;
        y7gVar.getClass();
        try {
            eig eigVar = (eig) y7gVar.b;
            Parcel parcelG0 = eigVar.G0();
            int i = agg.a;
            parcelG0.writeInt(z ? 1 : 0);
            eigVar.H0(parcelG0, 22);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Override // defpackage.i6d
    public long f() {
        long jMin = Long.MAX_VALUE;
        for (i6d i6dVar : (i6d[]) this.b) {
            long jF = i6dVar.f();
            if (jF != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jF);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    public void f0() {
        View viewFindViewById;
        View view = (View) this.b;
        if (view == null) {
            return;
        }
        if (view.isInEditMode() || view.onCheckIsTextEditor()) {
            view.requestFocus();
            viewFindViewById = view;
        } else {
            viewFindViewById = view.getRootView().findFocus();
        }
        if (viewFindViewById == null) {
            viewFindViewById = view.getRootView().findViewById(R.id.content);
        }
        if (viewFindViewById == null || !viewFindViewById.hasWindowFocus()) {
            return;
        }
        viewFindViewById.post(new mg(viewFindViewById, 6));
    }

    @Override // defpackage.abe
    public int g(long j) {
        return -1;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return ((k56) this.b).invoke();
    }

    @Override // defpackage.ye1, defpackage.ul1
    public void h() {
        g71 g71Var;
        l71 l71Var = ((m71) this.b).J0;
        if (l71Var == null || (g71Var = ((h71) ((qqd) l71Var).b).O0) == null) {
            return;
        }
        yxc yxcVar = CallScreen.R0;
        ((ki1) g71Var).a.D0().r();
    }

    @Override // defpackage.abe
    public long i(int i) {
        return 0L;
    }

    @Override // defpackage.tlf
    public int j() {
        gef gefVar = ((GifViewerWidget) this.b).s0;
        return 2;
    }

    @Override // defpackage.ye1, defpackage.ul1
    public void m() {
        g71 g71Var;
        l71 l71Var = ((m71) this.b).J0;
        if (l71Var == null || (g71Var = ((h71) ((qqd) l71Var).b).O0) == null) {
            return;
        }
        yxc yxcVar = CallScreen.R0;
        CallScreen callScreen = ((ki1) g71Var).a;
        callScreen.y0().d(2, 2);
        el1 el1VarD0 = callScreen.D0();
        el1VarD0.getClass();
        pnf.o(el1VarD0.M0, new qj1(c37.D(el1VarD0.s().k)));
    }

    @Override // defpackage.agf
    public void o(int i, int i2) {
        ((m1f) this.b).Y.execute(new ft0(this, i, i2, 2));
    }

    @Override // defpackage.hlf
    public void onFirstFrameRendered() {
        t88 t88Var = (t88) this.b;
        fm9.l(t88Var.d2);
        Surface surface = t88Var.d2;
        aab aabVar = t88Var.S1;
        Handler handler = (Handler) aabVar.a;
        if (handler != null) {
            handler.post(new tb2(aabVar, surface, SystemClock.elapsedRealtime(), 8));
        }
        t88Var.g2 = true;
    }

    @Override // defpackage.tlf
    public void onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        String str = ((GifViewerWidget) this.b).a;
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, str, "Media viewer. Video viewer, surface destroyed " + surfaceTexture, null);
        }
    }

    @Override // defpackage.abe
    public List p(long j) {
        return (List) this.b;
    }

    @Override // defpackage.i6d
    public long r() {
        long jMin = Long.MAX_VALUE;
        for (i6d i6dVar : (i6d[]) this.b) {
            long jR = i6dVar.r();
            if (jR != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jR);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // defpackage.i6d
    public void t(long j) {
        for (i6d i6dVar : (i6d[]) this.b) {
            i6dVar.t(j);
        }
    }

    @Override // defpackage.abe
    public int u() {
        return 1;
    }

    @Override // defpackage.xo1
    public void v(gg1 gg1Var, Point point) {
        g71 g71Var;
        gg1 gg1Var2;
        km1 km1Var;
        switch (this.a) {
            case 5:
                l71 l71Var = ((m71) this.b).J0;
                if (l71Var != null && (g71Var = ((h71) ((qqd) l71Var).b).O0) != null) {
                    yxc yxcVar = CallScreen.R0;
                    ((ki1) g71Var).a.D0().x(gg1Var, point);
                    break;
                }
                break;
            default:
                mm1 mm1Var = (mm1) this.b;
                qma qmaVar = mm1Var.W0;
                if (qmaVar != null && (gg1Var2 = qmaVar.c) != null && (km1Var = mm1Var.Y0) != null) {
                    yxc yxcVar2 = CallScreen.R0;
                    ((ui1) km1Var).a.D0().x(gg1Var2, null);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.cj9
    public zw6 w(int i) {
        return ((lh4) this.b).w(i);
    }

    @Override // defpackage.e8
    public void x(Object obj) {
        d8 d8Var = (d8) obj;
        c cVar = (c) this.b;
        i16 i16Var = (i16) cVar.F.pollFirst();
        if (i16Var == null) {
            return;
        }
        a aVarC = cVar.c.c(i16Var.a);
        if (aVarC == null) {
            return;
        }
        aVarC.s0(i16Var.b, d8Var.a, d8Var.b);
    }

    @Override // defpackage.xo1
    public void y(gg1 gg1Var) {
        g71 g71Var;
        switch (this.a) {
            case 5:
                l71 l71Var = ((m71) this.b).J0;
                if (l71Var != null && (g71Var = ((h71) ((qqd) l71Var).b).O0) != null) {
                    yxc yxcVar = CallScreen.R0;
                    ((ki1) g71Var).a.D0().Z.c(gg1Var);
                    break;
                }
                break;
            default:
                km1 km1Var = ((mm1) this.b).Y0;
                if (km1Var != null) {
                    yxc yxcVar2 = CallScreen.R0;
                    ((ui1) km1Var).a.D0().Z.c(gg1Var);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.uq8
    public boolean z(wq8 wq8Var, MenuItem menuItem) {
        boolean z;
        boolean zOnMenuItemClick;
        h7 h7Var = ((ActionMenuView) this.b).z0;
        if (h7Var == null) {
            return false;
        }
        Toolbar toolbar = (Toolbar) ((bkg) h7Var).b;
        Iterator it = ((CopyOnWriteArrayList) toolbar.U0.b).iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            if (((e16) it.next()).a.p(menuItem)) {
                z = true;
                break;
            }
        }
        if (z) {
            zOnMenuItemClick = true;
        } else {
            kwe kweVar = toolbar.W0;
            zOnMenuItemClick = kweVar != null ? kweVar.onMenuItemClick(menuItem) : false;
        }
        return zOnMenuItemClick;
    }

    public rxd(xr6 xr6Var) {
        this.a = 4;
        fp3.n(xr6Var);
        this.b = xr6Var;
    }

    public rxd(int i) {
        this.a = i;
        switch (i) {
            case 13:
                this.b = new lh4(4);
                break;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                this.b = (ExtraSupportedSurfaceCombinationsQuirk) zi4.a.e(ExtraSupportedSurfaceCombinationsQuirk.class);
                break;
        }
    }

    public rxd(CameraDevice cameraDevice) {
        this.a = 7;
        cameraDevice.getClass();
        this.b = new mw1(cameraDevice, null);
    }
}
