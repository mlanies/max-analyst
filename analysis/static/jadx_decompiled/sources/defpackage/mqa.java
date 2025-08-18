package defpackage;

import java.util.List;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.layout.ConversationVideoTrackParticipantKey;

/* loaded from: classes.dex */
public abstract class mqa {
    public static final hg1 a() {
        gg1 gg1Var = gg1.c;
        ParticipantId participantIdD = d(gg1Var);
        rd8 rd8Var = rd8.a;
        return new hg1(gg1Var, rd8Var, rd8Var, rd8Var, false, false, new llf(false, new ConversationVideoTrackParticipantKey.Builder().setParticipantId(participantIdD).build(), false), new llf(false, new ConversationVideoTrackParticipantKey.Builder().setParticipantId(participantIdD).setType(olf.b).build(), false), false, false, false, false, false, 0L, true, false, false, false, false, false, nz4.a, 1);
    }

    public static final gg1 b(ParticipantId participantId) {
        Integer numE0;
        int iIntValue = 0;
        List listQ0 = w9e.Q0(participantId.id, new String[]{":"}, false, 6);
        if (listQ0.size() > 1 && (numE0 = dae.e0((String) listQ0.get(1))) != null) {
            iIntValue = numE0.intValue();
        }
        return new gg1(Long.parseLong((String) x53.g0(listQ0)), iIntValue);
    }

    public static final ParticipantId c(long j) {
        return ParticipantId.authorized(String.valueOf(j));
    }

    public static final ParticipantId d(gg1 gg1Var) {
        return new ParticipantId(String.valueOf(gg1Var.a), false, gg1Var.b);
    }
}
