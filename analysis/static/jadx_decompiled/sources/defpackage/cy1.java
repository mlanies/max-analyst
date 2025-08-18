package defpackage;

import android.net.Uri;
import android.view.Surface;
import android.widget.SeekBar;
import java.io.File;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import ru.ok.tamtam.android.widgets.quickcamera.CameraExceptionImpl;
import ru.ok.tamtam.android.widgets.quickcamera.CameraxCameraApiView;

/* loaded from: classes2.dex */
public final /* synthetic */ class cy1 implements tj3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cy1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.tj3
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                xkf xkfVar = (xkf) obj;
                int i = CameraxCameraApiView.u0;
                if (xkfVar instanceof skf) {
                    skf skfVar = (skf) xkfVar;
                    boolean z = skfVar.b != 0;
                    CameraxCameraApiView cameraxCameraApiView = (CameraxCameraApiView) this.b;
                    if (z) {
                        hm9.n(CameraxCameraApiView.class.getName(), "onCameraError");
                        cx1 cx1Var = cameraxCameraApiView.s0;
                        if (cx1Var != null) {
                            ((rxd) cx1Var).b0(new CameraExceptionImpl(skfVar.c));
                            break;
                        }
                    } else {
                        hm9.n(CameraxCameraApiView.class.getName(), "onVideoTaken");
                        cx1 cx1Var2 = cameraxCameraApiView.s0;
                        if (cx1Var2 != null) {
                            File file = skfVar.a.b.c;
                            urb urbVar = ((rrb) ((rxd) cx1Var2).b).o;
                            if (urbVar == null) {
                                urbVar = null;
                            }
                            pnf.n(urbVar, ((w9a) urbVar.s0).b(), null, new trb(urbVar, file, null), 2);
                            break;
                        }
                    }
                }
                break;
            case 1:
                gr7 gr7Var = (gr7) obj;
                gr7Var.d = ((fk9) this.b).C0.c;
                gr7Var.b = false;
                break;
            case 2:
                gr7 gr7Var2 = (gr7) obj;
                gr7Var2.b = ((Boolean) this.b).booleanValue();
                gr7Var2.a = true;
                break;
            case 3:
                ((gr7) obj).e = (hr7) this.b;
                break;
            case 4:
                ((ol9) obj).m1(((SeekBar) this.b).getProgress());
                break;
            case 5:
                el9 el9Var = (el9) obj;
                int checkedChipId = ((il9) this.b).s0.getCheckedChipId();
                hr7 hr7Var = checkedChipId == xxb.layout_send_location__duration_20m ? hr7.c : checkedChipId == xxb.layout_send_location__duration_1h ? hr7.o : checkedChipId == xxb.layout_send_location__duration_3h ? hr7.X : checkedChipId == xxb.layout_send_location__duration_24h ? hr7.Y : checkedChipId == xxb.layout_send_location__duration_no_limit ? hr7.Z : hr7.X;
                el9Var.getClass();
                for (fk9 fk9Var : (Set) el9Var.a) {
                    fk9Var.getClass();
                    fk9Var.b2(new cy1(3, hr7Var));
                }
                break;
            case 6:
                ((adc) this.b).J = (Uri) obj;
                break;
            case 7:
                cc0 cc0Var = (cc0) obj;
                for (Map.Entry entry : ((Map) this.b).entrySet()) {
                    int i2 = cc0Var.b - ((cb0) entry.getKey()).f;
                    if (((cb0) entry.getKey()).g) {
                        i2 = -i2;
                    }
                    int i3 = e1f.i(i2);
                    iee ieeVar = (iee) entry.getValue();
                    ieeVar.getClass();
                    kq0.H(new ft0(ieeVar, i3, -1, 5));
                }
                break;
            case 8:
                u00 u00Var = (u00) this.b;
                if (u00Var != null) {
                    u00Var.f();
                    break;
                }
                break;
            case 9:
                ((lq1) this.b).b((bc0) obj);
                break;
            case 10:
                bc0 bc0Var = (bc0) obj;
                zm4 zm4Var = (zm4) this.b;
                zm4Var.getClass();
                bc0Var.b.hashCode();
                Surface surface = (Surface) zm4Var.g;
                Surface surface2 = bc0Var.b;
                if (surface2 == surface) {
                    zm4Var.g = null;
                    ((lq1) zm4Var.n).b((d15) zm4Var.f);
                    zm4Var.e();
                    break;
                } else {
                    surface2.release();
                    break;
                }
            default:
                ejf ejfVar = (ejf) this.b;
                xkf xkfVar2 = (xkf) obj;
                if (xkfVar2 instanceof vkf) {
                    if (ejfVar.B0 != null) {
                        ejfVar.M0.o1(ejfVar, ejf.N0[0], j47.T(ejfVar.t0, null, vx3.b, new cjf(ejfVar, null), 1));
                        break;
                    }
                } else if (xkfVar2 instanceof skf) {
                    skf skfVar2 = (skf) xkfVar2;
                    if (skfVar2.b != 0) {
                        String name = ejf.class.getName();
                        Throwable th = skfVar2.c;
                        hm9.p(name, wg0.i("onCameraError: ", th != null ? th.getLocalizedMessage() : null), skfVar2.c);
                        h7b h7bVar = ejfVar.u0;
                        if (h7bVar != null) {
                            ((AtomicReference) h7bVar.c).set(ri5.a);
                            ((CountDownLatch) h7bVar.b).countDown();
                        }
                    } else {
                        String name2 = ejf.class.getName();
                        ir6 ir6Var = hm9.m;
                        if (ir6Var != null && ir6Var.c()) {
                            ir6Var.d(us7.X, name2, "onVideoTaken", null);
                        }
                        h7b h7bVar2 = ejfVar.u0;
                        if (h7bVar2 != null) {
                            ((AtomicReference) h7bVar2.c).set(si5.a);
                            ((CountDownLatch) h7bVar2.b).countDown();
                        }
                    }
                    ejfVar.u0 = null;
                    break;
                }
                break;
        }
    }
}
