package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class y4c {
    public static final y4c X;
    public static final y4c Y;
    public static final y4c Z;
    public static final qq9 b;
    public static final y4c c;
    public static final y4c o;
    public static final y4c s0;
    public static final y4c t0;
    public static final y4c u0;
    public static final y4c v0;
    public static final y4c w0;
    public static final y4c x0;
    public static final /* synthetic */ y4c[] y0;
    public static final /* synthetic */ v25 z0;
    public final String a;

    static {
        y4c y4cVar = new y4c("AUDIO_FREEZES", 0, "AUDIO_FREEZES");
        c = y4cVar;
        y4c y4cVar2 = new y4c("AUDIO_CALL_INTERRUPTION", 1, "AUDIO_CALL_INTERRUPTION");
        o = y4cVar2;
        y4c y4cVar3 = new y4c("VOICE_COMMUNICATION_PROBLEM", 2, "VOICE_COMMUNICATION_PROBLEM");
        X = y4cVar3;
        y4c y4cVar4 = new y4c("AUDIO_QUALITY", 3, "AUDIO_QUALITY");
        Y = y4cVar4;
        y4c y4cVar5 = new y4c("AUDIO_ECHO", 4, "AUDIO_ECHO");
        Z = y4cVar5;
        y4c y4cVar6 = new y4c("VIDEO_FREEZES", 5, "VIDEO_FREEZES");
        s0 = y4cVar6;
        y4c y4cVar7 = new y4c("VIDEO_QUALITY", 6, "VIDEO_QUALITY");
        t0 = y4cVar7;
        y4c y4cVar8 = new y4c("VIDEO_SYNC", 7, "VIDEO_SYNC");
        u0 = y4cVar8;
        y4c y4cVar9 = new y4c("VIDEO_CALL_INTERRUPTION", 8, "VIDEO_CALL_INTERRUPTION");
        v0 = y4cVar9;
        y4c y4cVar10 = new y4c("USERS_FREEZES", 9, "USERS_FREEZES");
        w0 = y4cVar10;
        y4c y4cVar11 = new y4c("OTHER", 10, null);
        x0 = y4cVar11;
        y4c[] y4cVarArr = {y4cVar, y4cVar2, y4cVar3, y4cVar4, y4cVar5, y4cVar6, y4cVar7, y4cVar8, y4cVar9, y4cVar10, y4cVar11};
        y0 = y4cVarArr;
        z0 = new v25(y4cVarArr);
        b = new qq9();
    }

    public y4c(String str, int i, String str2) {
        this.a = str2;
    }

    public static y4c valueOf(String str) {
        return (y4c) Enum.valueOf(y4c.class, str);
    }

    public static y4c[] values() {
        return (y4c[]) y0.clone();
    }
}
