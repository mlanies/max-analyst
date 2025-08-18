package defpackage;

import java.util.ArrayList;
import java.util.Set;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final class sm1 {
    public static final Set o;
    public final qz7 a;
    public final a4c b;
    public final xje c;
    public final crd d;
    public final fd7 e;
    public final imc f;
    public final vte g;
    public final ece h = new ece();
    public final kad i = new kad(3);
    public final fl2 j;
    public final xe5 k;
    public final glc l;
    public final glc m;
    public final dp3 n;

    static {
        String str;
        int[] iArrV = au1.v(30);
        ArrayList arrayList = new ArrayList(iArrV.length);
        for (int i : iArrV) {
            switch (i) {
                case 1:
                    str = "rtt";
                    break;
                case 2:
                    str = "ss_freeze_count";
                    break;
                case 3:
                    str = "ss_total_freezes_duration";
                    break;
                case 4:
                    str = "cpu_usage_percent_total";
                    break;
                case 5:
                    str = "battery_level_change";
                    break;
                case 6:
                    str = "inserted_audio_samples_for_deceleration";
                    break;
                case 7:
                    str = "removed_audio_samples_for_acceleration";
                    break;
                case 8:
                    str = "concealed_audio_samples";
                    break;
                case 9:
                    str = "jitter_audio";
                    break;
                case 10:
                    str = "concealed_silent_audio_samples";
                    break;
                case 11:
                    str = "concealment_audio_avg_size";
                    break;
                case Protos.Attaches.Attach.PRESENT /* 12 */:
                    str = "audio_loss";
                    break;
                case 13:
                    str = "nack_sent";
                    break;
                case Protos.Attaches.Attach.LOCATION /* 14 */:
                    str = "pli_sent";
                    break;
                case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                    str = "fir_sent";
                    break;
                case 16:
                    str = "frames_decoded";
                    break;
                case LangUtils.HASH_SEED /* 17 */:
                    str = "frames_dropped";
                    break;
                case 18:
                    str = "jitter_video";
                    break;
                case 19:
                    str = "interframe_delay_variance";
                    break;
                case 20:
                    str = "freeze_count";
                    break;
                case 21:
                    str = "total_freezes_duration";
                    break;
                case 22:
                    str = "video_loss";
                    break;
                case 23:
                    str = "nack_received";
                    break;
                case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                    str = "pli_received";
                    break;
                case 25:
                    str = "fir_received";
                    break;
                case 26:
                    str = "adaptation_changes";
                    break;
                case 27:
                    str = "frames_encoded";
                    break;
                case 28:
                    str = "br_encode";
                    break;
                case 29:
                    str = "br_transmit";
                    break;
                case 30:
                    str = "br_retransmit";
                    break;
                default:
                    throw null;
            }
            arrayList.add(str);
        }
        o = x53.H0(arrayList);
    }

    public sm1(qz7 qz7Var, a4c a4cVar, xje xjeVar, crd crdVar, fd7 fd7Var, imc imcVar, wte wteVar) {
        this.a = qz7Var;
        this.b = a4cVar;
        this.c = xjeVar;
        this.d = crdVar;
        this.e = fd7Var;
        this.f = imcVar;
        this.g = wteVar;
        this.j = new fl2(a4cVar);
        xe5 xe5Var = new xe5();
        xe5Var.a = new h7b(23, false);
        xe5Var.b = new lh4(0);
        xe5Var.c = new lh4(0);
        xe5Var.o = new lh4(0);
        xe5Var.X = new lh4(0);
        xe5Var.Y = new sy4(29);
        this.k = xe5Var;
        this.l = new glc(9);
        this.m = new glc(7);
        this.n = new dp3();
    }
}
