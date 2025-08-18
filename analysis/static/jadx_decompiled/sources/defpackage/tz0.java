package defpackage;

import java.util.Map;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.audio.MicrophoneManager;
import ru.ok.android.externcalls.sdk.media.mute.MediaMuteManager;
import ru.ok.android.externcalls.sdk.media.mute.listener.MediaMuteManagerListener;
import ru.ok.android.externcalls.sdk.video.CameraManager;

/* loaded from: classes.dex */
public final class tz0 implements MediaMuteManagerListener {
    public final /* synthetic */ yz0 a;
    public final /* synthetic */ je7 b;
    public final /* synthetic */ je7 c;
    public final /* synthetic */ je7 d;

    public tz0(yz0 yz0Var, je7 je7Var, je7 je7Var2, je7 je7Var3) {
        this.a = yz0Var;
        this.b = je7Var;
        this.c = je7Var2;
        this.d = je7Var3;
    }

    @Override // ru.ok.android.externcalls.sdk.media.mute.listener.MediaMuteManagerListener
    public final void onMuteChanged(vi9 vi9Var) {
        boolean zC;
        Object value;
        Object value2;
        boolean z;
        Object value3;
        rd8 rd8Var = (rd8) vi9Var.a.get(qd8.b);
        rd8 rd8Var2 = rd8.a;
        if (rd8Var != null) {
            yz0 yz0Var = this.a;
            je7 je7Var = this.b;
            yz0Var.getClass();
            boolean z2 = rd8Var == rd8Var2;
            ir6 ir6Var = hm9.m;
            if (ir6Var != null && ir6Var.c()) {
                ir6Var.d(us7.X, "CallAdminSettingsController", "Video was disabled by admin to " + rd8Var, null);
            }
            if (z2) {
                z = false;
            } else {
                CameraManager cameraManagerA = ((r21) je7Var.getValue()).a();
                z = cameraManagerA != null && cameraManagerA.isCameraEnabled();
                CameraManager cameraManagerA2 = ((r21) je7Var.getValue()).a();
                if (cameraManagerA2 != null) {
                    cameraManagerA2.setCameraEnabled(false);
                }
            }
            q0e q0eVar = yz0Var.E0;
            do {
                value3 = q0eVar.getValue();
            } while (!q0eVar.c(value3, aa.a((aa) value3, false, yz0.h(rd8Var), false, false, false, false, 125)));
            if (!yz0.h(rd8Var)) {
                yz0Var.C0.g(new xa(true, false));
            } else if (z) {
                yz0Var.C0.g(ra.a);
            }
        }
        rd8 rd8Var3 = (rd8) vi9Var.a.get(qd8.a);
        if (rd8Var3 != null) {
            yz0 yz0Var2 = this.a;
            je7 je7Var2 = this.c;
            yz0Var2.getClass();
            boolean z3 = rd8Var3 == rd8Var2;
            ir6 ir6Var2 = hm9.m;
            if (ir6Var2 != null && ir6Var2.c()) {
                ir6Var2.d(us7.X, "CallAdminSettingsController", "Microphone was changed by admin to " + rd8Var3, null);
            }
            if (!z3) {
                ((a11) ((z01) je7Var2.getValue())).d();
                MicrophoneManager microphoneManagerC = ((a11) ((z01) je7Var2.getValue())).c();
                if (microphoneManagerC != null) {
                    microphoneManagerC.setMicEnabled(false);
                }
            }
            q0e q0eVar2 = yz0Var2.E0;
            do {
                value2 = q0eVar2.getValue();
            } while (!q0eVar2.c(value2, aa.a((aa) value2, false, false, yz0.h(rd8Var3), false, false, false, 123)));
            Conversation conversationA = yz0Var2.d().a();
            if (!(conversationA != null ? conversationA.isMeCreatorOrAdmin() : false)) {
                if (!yz0.h(rd8Var3)) {
                    yz0Var2.C0.g(new za(true, false));
                } else if (!z3) {
                    yz0Var2.C0.g(sa.a);
                }
            }
        }
        rd8 rd8Var4 = (rd8) vi9Var.a.get(qd8.c);
        if (rd8Var4 != null) {
            yz0 yz0Var3 = this.a;
            je7 je7Var3 = this.d;
            yz0Var3.getClass();
            boolean z4 = rd8Var4 == rd8Var2;
            ir6 ir6Var3 = hm9.m;
            if (ir6Var3 != null && ir6Var3.c()) {
                ir6Var3.d(us7.X, "CallAdminSettingsController", "Screen sharing was disabled by admin to " + rd8Var4, null);
            }
            if (z4) {
                zC = false;
            } else {
                zC = ((xuc) je7Var3.getValue()).c();
                ((xuc) je7Var3.getValue()).b(false);
            }
            q0e q0eVar3 = yz0Var3.E0;
            do {
                value = q0eVar3.getValue();
            } while (!q0eVar3.c(value, aa.a((aa) value, false, false, false, yz0.h(rd8Var4), false, false, 119)));
            if (!yz0.h(rd8Var4) && zC) {
                yz0Var3.C0.g(new db(true, false));
            } else if (zC) {
                yz0Var3.C0.g(va.a);
            }
        }
    }

    @Override // ru.ok.android.externcalls.sdk.media.mute.listener.MediaMuteManagerListener
    public final void onMuteStateInitialized(vi9 vi9Var) {
        boolean zH;
        sd8 mediaOptionsForCall$default;
        rd8 rd8Var;
        boolean zH2;
        sd8 mediaOptionsForCall$default2;
        rd8 rd8Var2;
        boolean zH3;
        sd8 mediaOptionsForCall$default3;
        rd8 rd8Var3;
        yz0 yz0Var = this.a;
        if (yz0Var.u0.get()) {
            return;
        }
        qd8 qd8Var = qd8.b;
        Map map = vi9Var.a;
        rd8 rd8Var4 = (rd8) map.get(qd8Var);
        boolean zH4 = false;
        if (rd8Var4 != null) {
            zH = yz0.h(rd8Var4);
        } else {
            MediaMuteManager mediaMuteManagerE = yz0Var.e();
            zH = (mediaMuteManagerE == null || (mediaOptionsForCall$default = MediaMuteManager.getMediaOptionsForCall$default(mediaMuteManagerE, null, 1, null)) == null || (rd8Var = mediaOptionsForCall$default.b) == null) ? false : yz0.h(rd8Var);
        }
        rd8 rd8Var5 = (rd8) map.get(qd8.a);
        if (rd8Var5 != null) {
            zH2 = yz0.h(rd8Var5);
        } else {
            MediaMuteManager mediaMuteManagerE2 = yz0Var.e();
            zH2 = (mediaMuteManagerE2 == null || (mediaOptionsForCall$default2 = MediaMuteManager.getMediaOptionsForCall$default(mediaMuteManagerE2, null, 1, null)) == null || (rd8Var2 = mediaOptionsForCall$default2.a) == null) ? false : yz0.h(rd8Var2);
        }
        rd8 rd8Var6 = (rd8) map.get(qd8.c);
        if (rd8Var6 != null) {
            zH3 = yz0.h(rd8Var6);
        } else {
            MediaMuteManager mediaMuteManagerE3 = yz0Var.e();
            if (mediaMuteManagerE3 != null && (mediaOptionsForCall$default3 = MediaMuteManager.getMediaOptionsForCall$default(mediaMuteManagerE3, null, 1, null)) != null && (rd8Var3 = mediaOptionsForCall$default3.c) != null) {
                zH4 = yz0.h(rd8Var3);
            }
            zH3 = zH4;
        }
        yz0Var.k(zH, zH2, zH3);
        yz0Var.u0.set(true);
        yz0Var.j();
    }
}
