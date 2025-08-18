package defpackage;

import android.app.Activity;
import android.hardware.camera2.CameraCharacteristics;
import androidx.camera.core.ImageCaptureException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import one.me.calllist.ui.callinfo.CallLinkInfoScreen;
import one.me.calls.ui.bottomsheet.opponents.CallOpponentsListWidget;
import one.me.calls.ui.ui.settings.CallAdminSettingsScreen;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.webrtc.NativeDoubleArrayConsumer;
import ru.ok.android.externcalls.analytics.internal.api.CallAnalyticsApiRequest;
import ru.ok.android.externcalls.sdk.audio.CallsAudioManager;
import ru.ok.android.externcalls.sdk.audio.VideoTracker;
import ru.ok.android.externcalls.sdk.media.mute.MediaMuteManager;
import ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager;
import ru.ok.messages.video.widgets.LiveVideoPlaceHolderView;

/* loaded from: classes.dex */
public final /* synthetic */ class ync implements NativeDoubleArrayConsumer.Consumer, o3a, qj3, mq1, o1d, za7, m7a, gp1, VideoTracker, CallsAudioManager.OnAudioDeviceInfoChangeListener, wu, pv6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ync(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.gp1
    public void a(boolean z) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 18:
                no1.I((no1) obj, z);
                break;
            default:
                ap1.w((ap1) obj, z);
                break;
        }
    }

    @Override // defpackage.qj3
    public void accept(Object obj) {
        switch (this.a) {
            case 3:
                rz rzVar = (rz) this.b;
                LiveVideoPlaceHolderView liveVideoPlaceHolderView = rzVar.s;
                if (liveVideoPlaceHolderView == null || liveVideoPlaceHolderView.getVisibility() != 0) {
                    return;
                }
                if (s5c.b0(((y8a) vl.b()).n(), rzVar.i)) {
                    rzVar.s.x();
                } else {
                    rzVar.s.setVisibility(8);
                }
                qz qzVar = rzVar.h;
                if (qzVar != null) {
                    qzVar.g();
                    return;
                }
                return;
            case 4:
                hm9.p("l00", "Can't download attach", null);
                ((l00) this.b).a.C(false);
                return;
            case 5:
                ((hc3) this.b).a((zl4) obj);
                return;
            case 6:
                ((Map) this.b).putAll((Map) obj);
                return;
            case 7:
                j10 j10Var = (j10) obj;
                if (!(j10Var.e != null) && j10Var.d == null && j10Var.r == null) {
                    hm9.p("t20", "Attach is not audio/video/file. Ignore", null);
                    return;
                } else if (j10Var.x == z10.c) {
                    hm9.p("t20", "Try to update processingOnServerStatus from PROCESSED. Ignore", null);
                    return;
                } else {
                    j10Var.x = (z10) this.b;
                    return;
                }
            case 8:
            default:
                fd1 fd1Var = (fd1) this.b;
                List list = (List) obj;
                synchronized (fd1Var) {
                    hm9.n("fd1", "onLoaded: " + list.size());
                    Iterator it = fd1Var.e.iterator();
                    if (it.hasNext()) {
                        au1.r(it.next());
                        throw null;
                    }
                }
                return;
            case 9:
                xi0 xi0Var = (xi0) this.b;
                xi0Var.a.G((sn0) obj);
                xi0Var.a.I();
                return;
        }
    }

    @Override // defpackage.wu
    public bm7 apply(Object obj) {
        su1 su1Var = (su1) this.b;
        su1Var.getClass();
        if (!Boolean.TRUE.equals((Boolean) obj)) {
            return dw6.c;
        }
        long j = su1Var.g;
        un0 un0Var = new un0(11);
        long millis = TimeUnit.NANOSECONDS.toMillis(j);
        uu1 uu1Var = new uu1(un0Var);
        st1 st1Var = su1Var.d;
        st1Var.p(uu1Var);
        wt1 wt1Var = new wt1(st1Var, 4, uu1Var);
        oq1 oq1Var = uu1Var.b;
        oq1Var.b.d(wt1Var, st1Var.c);
        return f8.g(new vg4(oq1Var, su1Var.c, millis));
    }

    public Object b(CameraCharacteristics.Key key) {
        return ((xv1) this.b).a(key);
    }

    @Override // defpackage.m7a
    public void c(int i) {
        final yz0 yz0Var;
        ParticipantStatesManager participantStatesManagerF;
        final int i2 = 1;
        final int i3 = 0;
        bc7[] bc7VarArr = CallOpponentsListWidget.H0;
        int i4 = y7a.f1;
        CallOpponentsListWidget callOpponentsListWidget = (CallOpponentsListWidget) this.b;
        if (i == i4) {
            of1 of1VarR0 = callOpponentsListWidget.r0();
            of1VarR0.getClass();
            pnf.o(of1VarR0.E0, new ej1(c37.D(((d04) of1VarR0.Y.b().getValue()).d)));
            return;
        }
        if (i == y7a.d1) {
            of1 of1VarR02 = callOpponentsListWidget.r0();
            Long l = ((y21) ((l31) of1VarR02.b).k.getValue()).a;
            if (l != null) {
                long jLongValue = l.longValue();
                boolean z = ((t33) ((q33) of1VarR02.w0.getValue())).g.getBoolean("app.call.add.dontshowconfirmation", false);
                s35 s35Var = of1VarR02.E0;
                if (!z) {
                    pnf.o(s35Var, gj1.D);
                    return;
                }
                je1.c.getClass();
                wg0.k(":profile/add-members?chat_id=" + jLongValue, s35Var);
                return;
            }
            return;
        }
        if (i == y7a.e1) {
            of1 of1VarR03 = callOpponentsListWidget.r0();
            of1VarR03.getClass();
            pnf.o(of1VarR03.E0, new qj1(c37.D(((d04) of1VarR03.Y.b().getValue()).d)));
            return;
        }
        int i5 = y7a.b;
        rd8 rd8Var = rd8.b;
        if (i == i5) {
            of1 of1VarR04 = callOpponentsListWidget.r0();
            final yz0 yz0Var2 = (yz0) ((ez0) of1VarR04.t0.getValue());
            MediaMuteManager mediaMuteManagerE = yz0Var2.e();
            if (mediaMuteManagerE != null) {
                ky7 ky7Var = new ky7();
                ky7Var.put(qd8.b, rd8Var);
                MediaMuteManager.updateMediaOptionsForAll$default(mediaMuteManagerE, ky7Var.b(), null, new kz0(yz0Var2, i2), new m56() { // from class: lz0
                    @Override // defpackage.m56
                    public final Object invoke(Object obj) {
                        int i6 = i2;
                        yz0 yz0Var3 = yz0Var2;
                        Throwable th = (Throwable) obj;
                        switch (i6) {
                            case 0:
                                ir6 ir6Var = hm9.m;
                                if (ir6Var != null && ir6Var.c()) {
                                    ir6Var.d(us7.X, "CallAdminSettingsController", wg0.i("Low hands for all failed due to: ", th.getMessage()), null);
                                }
                                yz0Var3.C0.g(new bb(false));
                                break;
                            case 1:
                                ir6 ir6Var2 = hm9.m;
                                if (ir6Var2 != null && ir6Var2.c()) {
                                    ir6Var2.d(us7.X, "CallAdminSettingsController", wg0.i("Disable cameras for all once failed due to: ", th.getMessage()), null);
                                }
                                yz0Var3.C0.g(new ya(false));
                                break;
                            default:
                                ir6 ir6Var3 = hm9.m;
                                if (ir6Var3 != null && ir6Var3.c()) {
                                    ir6Var3.d(us7.X, "CallAdminSettingsController", wg0.i("Disable microphone for all once failed due to: ", th.getMessage()), null);
                                }
                                yz0Var3.C0.g(new ab(false));
                                break;
                        }
                        return e5f.a;
                    }
                }, 2, null);
            }
            pnf.o(of1VarR04.E0, aj1.D);
            return;
        }
        if (i != y7a.d) {
            if (i != y7a.c || (participantStatesManagerF = (yz0Var = (yz0) ((ez0) callOpponentsListWidget.r0().t0.getValue())).f()) == null) {
                return;
            }
            participantStatesManagerF.lowerHandForAll(new kz0(yz0Var, i3), new m56() { // from class: lz0
                @Override // defpackage.m56
                public final Object invoke(Object obj) {
                    int i6 = i3;
                    yz0 yz0Var3 = yz0Var;
                    Throwable th = (Throwable) obj;
                    switch (i6) {
                        case 0:
                            ir6 ir6Var = hm9.m;
                            if (ir6Var != null && ir6Var.c()) {
                                ir6Var.d(us7.X, "CallAdminSettingsController", wg0.i("Low hands for all failed due to: ", th.getMessage()), null);
                            }
                            yz0Var3.C0.g(new bb(false));
                            break;
                        case 1:
                            ir6 ir6Var2 = hm9.m;
                            if (ir6Var2 != null && ir6Var2.c()) {
                                ir6Var2.d(us7.X, "CallAdminSettingsController", wg0.i("Disable cameras for all once failed due to: ", th.getMessage()), null);
                            }
                            yz0Var3.C0.g(new ya(false));
                            break;
                        default:
                            ir6 ir6Var3 = hm9.m;
                            if (ir6Var3 != null && ir6Var3.c()) {
                                ir6Var3.d(us7.X, "CallAdminSettingsController", wg0.i("Disable microphone for all once failed due to: ", th.getMessage()), null);
                            }
                            yz0Var3.C0.g(new ab(false));
                            break;
                    }
                    return e5f.a;
                }
            });
            return;
        }
        of1 of1VarR05 = callOpponentsListWidget.r0();
        final yz0 yz0Var3 = (yz0) ((ez0) of1VarR05.t0.getValue());
        MediaMuteManager mediaMuteManagerE2 = yz0Var3.e();
        if (mediaMuteManagerE2 != null) {
            ky7 ky7Var2 = new ky7();
            ky7Var2.put(qd8.a, rd8Var);
            final int i6 = 2;
            MediaMuteManager.updateMediaOptionsForAll$default(mediaMuteManagerE2, ky7Var2.b(), null, new kz0(yz0Var3, 4), new m56() { // from class: lz0
                @Override // defpackage.m56
                public final Object invoke(Object obj) {
                    int i62 = i6;
                    yz0 yz0Var32 = yz0Var3;
                    Throwable th = (Throwable) obj;
                    switch (i62) {
                        case 0:
                            ir6 ir6Var = hm9.m;
                            if (ir6Var != null && ir6Var.c()) {
                                ir6Var.d(us7.X, "CallAdminSettingsController", wg0.i("Low hands for all failed due to: ", th.getMessage()), null);
                            }
                            yz0Var32.C0.g(new bb(false));
                            break;
                        case 1:
                            ir6 ir6Var2 = hm9.m;
                            if (ir6Var2 != null && ir6Var2.c()) {
                                ir6Var2.d(us7.X, "CallAdminSettingsController", wg0.i("Disable cameras for all once failed due to: ", th.getMessage()), null);
                            }
                            yz0Var32.C0.g(new ya(false));
                            break;
                        default:
                            ir6 ir6Var3 = hm9.m;
                            if (ir6Var3 != null && ir6Var3.c()) {
                                ir6Var3.d(us7.X, "CallAdminSettingsController", wg0.i("Disable microphone for all once failed due to: ", th.getMessage()), null);
                            }
                            yz0Var32.C0.g(new ab(false));
                            break;
                    }
                    return e5f.a;
                }
            }, 2, null);
        }
        pnf.o(of1VarR05.E0, aj1.D);
    }

    @Override // org.webrtc.NativeDoubleArrayConsumer.Consumer
    public void consume(Double[] dArr) {
        ((AtomicInteger) ((kad) ((bg4) this.b).o).Z).incrementAndGet();
    }

    public void d() {
        znc zncVar = (znc) this.b;
        if (zncVar.f) {
            Iterator it = zncVar.e().iterator();
            int i = 0;
            while (it.hasNext()) {
                a3a a3aVar = ((coc) it.next()).a.onBackPressedCallback;
                int i2 = i + 1;
                boolean z = true;
                if (i <= 0 && zncVar.e == 1) {
                    z = false;
                }
                a3aVar.f(z);
                i = i2;
            }
        }
    }

    @Override // defpackage.pv6
    public void f(qv6 qv6Var) throws Exception {
        l84 l84Var = (l84) this.b;
        l84Var.getClass();
        try {
            ov6 ov6VarG = qv6Var.g();
            if (ov6VarG != null) {
                l84Var.H(ov6VarG);
            } else {
                x9b x9bVar = (x9b) l84Var.a;
                if (x9bVar != null) {
                    l84Var.L(new ec0(x9bVar.a, new ImageCaptureException("Failed to acquire latest image", null)));
                }
            }
        } catch (IllegalStateException e) {
            x9b x9bVar2 = (x9b) l84Var.a;
            if (x9bVar2 != null) {
                l84Var.L(new ec0(x9bVar2.a, new ImageCaptureException("Failed to acquire latest image", e)));
            }
        }
    }

    @Override // defpackage.o1d
    public int i(int i) {
        switch (this.a) {
            case 13:
                h01 h01Var = (h01) ((ol7) ((CallAdminSettingsScreen) this.b).c.C(i));
                int iA = h01Var.a();
                if (h01Var.g()) {
                    return iA;
                }
                return 0;
            default:
                return ((jc1) ((ol7) ((CallLinkInfoScreen) this.b).z0.C(i))).v();
        }
    }

    @Override // ru.ok.android.externcalls.sdk.audio.CallsAudioManager.OnAudioDeviceInfoChangeListener
    public void onAudioDeviceChanged(CallsAudioManager.AudioDeviceInfoChangedEvent audioDeviceInfoChangedEvent) {
        Object value;
        ti9 ti9Var = (ti9) ((ir1) this.b).p.getValue();
        do {
            value = ti9Var.getValue();
        } while (!ti9Var.c(value, audioDeviceInfoChangedEvent.getNewDevice()));
    }

    @Override // defpackage.o3a
    public void onFailure(Exception exc) {
        up.a.getClass();
        nd7.A((Activity) this.b, tp.b);
    }

    @Override // defpackage.za7
    public Object parse(db7 db7Var) {
        return ((CallAnalyticsApiRequest) this.b).lambda$getOkParser$0(db7Var);
    }

    @Override // ru.ok.android.externcalls.sdk.audio.VideoTracker
    public boolean preferSpeakerOverEarpiece() {
        return ((Boolean) ((ni9) ((vb7) this.b)).invoke()).booleanValue();
    }

    @Override // defpackage.mq1
    public String q(lq1 lq1Var) {
        switch (this.a) {
            case 8:
                e70 e70Var = (e70) this.b;
                e70Var.a.execute(new c(e70Var, 10, lq1Var));
                return "AudioSource-release";
            case 22:
                st1 st1Var = (st1) this.b;
                st1Var.getClass();
                st1Var.c.execute(new c(st1Var, 28, lq1Var));
                return "updateSessionConfigAsync";
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                nu1 nu1Var = (nu1) this.b;
                nu1Var.a.h.d(lq1Var);
                nu1Var.b.b = true;
                return "AePreCapture";
            case 25:
                ((pu1) this.b).b.i.c();
                lq1Var.b(null);
                return "invokePostCaptureFuture";
            default:
                ((uu1) this.b).a = lq1Var;
                return "waitFor3AResult";
        }
    }
}
