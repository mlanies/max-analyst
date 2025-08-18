package ru.ok.android.externcalls.sdk;

import defpackage.ao9;
import defpackage.bg1;
import defpackage.eg1;
import defpackage.fg1;
import defpackage.o61;
import defpackage.rd8;
import defpackage.rh4;
import defpackage.zc9;
import java.util.Collections;
import java.util.List;
import ru.ok.android.externcalls.sdk.id.IdMappingWrapper;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.id.local.LocalIdMappings;
import ru.ok.android.externcalls.sdk.id.local.LocalParticipantId;
import ru.ok.android.externcalls.sdk.log.GlobalRTCLogger;

/* loaded from: classes2.dex */
public class ConversationParticipant {
    private static final String LOG_TAG = "ConversationParticipant";
    private fg1 callParticipant;
    private ParticipantId externalId;
    private bg1 internalId;
    private final LocalParticipantId localParticipantId = LocalParticipantId.nextId();
    private boolean reported;

    private ConversationParticipant() {
    }

    public static ConversationParticipant fromExternal(ParticipantId participantId, IdMappingWrapper idMappingWrapper) {
        ConversationParticipant conversationParticipant = new ConversationParticipant();
        conversationParticipant.setExternalId(participantId);
        bg1 byExternal = idMappingWrapper.getByExternal(participantId);
        if (byExternal != null) {
            conversationParticipant.setInternalId(byExternal);
        }
        return conversationParticipant;
    }

    public static ConversationParticipant fromInternal(bg1 bg1Var, IdMappingWrapper idMappingWrapper) {
        ConversationParticipant conversationParticipant = new ConversationParticipant();
        conversationParticipant.setInternalId(bg1Var);
        ParticipantId byInternal = idMappingWrapper.getByInternal(bg1Var);
        if (byInternal != null) {
            conversationParticipant.setExternalId(byInternal);
        }
        return conversationParticipant;
    }

    public void deAnonymize(fg1 fg1Var, ParticipantId participantId, ParticipantId participantId2, LocalIdMappings localIdMappings) {
        this.externalId = participantId2;
        this.callParticipant = fg1Var;
        localIdMappings.deAnonymizeMapping(participantId, this);
    }

    public long getAcceptCallEpochMs() {
        fg1 fg1Var = this.callParticipant;
        if (fg1Var != null) {
            return fg1Var.m;
        }
        return 0L;
    }

    public String getAcceptedCallClientType() {
        fg1 fg1Var = this.callParticipant;
        if (fg1Var == null) {
            return null;
        }
        return fg1Var.k;
    }

    public String getAcceptedCallPlatform() {
        fg1 fg1Var = this.callParticipant;
        if (fg1Var == null) {
            return null;
        }
        return fg1Var.l;
    }

    public rd8 getAudioOptionState() {
        fg1 fg1Var = this.callParticipant;
        return fg1Var != null ? fg1Var.b.a : rd8.a;
    }

    public fg1 getCallParticipant() {
        return this.callParticipant;
    }

    public ParticipantId getExternalId() {
        return this.externalId;
    }

    public bg1 getInternalId() {
        return this.internalId;
    }

    public LocalParticipantId getLocalParticipantId() {
        return this.localParticipantId;
    }

    public List<zc9> getMovies() {
        fg1 fg1Var = this.callParticipant;
        return fg1Var == null ? Collections.emptyList() : fg1Var.q;
    }

    public ao9 getNetworkStatus() {
        fg1 fg1Var = this.callParticipant;
        return fg1Var == null ? ao9.a : fg1Var.i;
    }

    public rd8 getScreenshareOptionState() {
        fg1 fg1Var = this.callParticipant;
        return fg1Var != null ? fg1Var.b.c : rd8.a;
    }

    public rd8 getVideoOptionState() {
        fg1 fg1Var = this.callParticipant;
        return fg1Var != null ? fg1Var.b.b : rd8.a;
    }

    public rd8 getWatchTogetherOptionState() {
        fg1 fg1Var = this.callParticipant;
        return fg1Var != null ? fg1Var.b.d : rd8.a;
    }

    public boolean hasRegisteredPeers() {
        fg1 fg1Var = this.callParticipant;
        return (fg1Var == null || (fg1Var.j == null && fg1Var.f.isEmpty())) ? false : true;
    }

    public boolean isAdmin() {
        fg1 fg1Var = this.callParticipant;
        return fg1Var != null && fg1Var.e.contains(eg1.b);
    }

    public boolean isAnimojiEnabled() {
        fg1 fg1Var = this.callParticipant;
        return fg1Var != null && fg1Var.c.g;
    }

    public boolean isAudioEnabled() {
        fg1 fg1Var = this.callParticipant;
        return fg1Var != null && fg1Var.c.e;
    }

    public boolean isCallAccepted() {
        fg1 fg1Var = this.callParticipant;
        return fg1Var != null && fg1Var.b();
    }

    public boolean isConnected() {
        fg1 fg1Var = this.callParticipant;
        return fg1Var != null && fg1Var.g;
    }

    public boolean isCreator() {
        fg1 fg1Var = this.callParticipant;
        return fg1Var != null && fg1Var.e.contains(eg1.a);
    }

    public boolean isPrimarySpeaker() {
        fg1 fg1Var = this.callParticipant;
        return fg1Var != null && fg1Var.c();
    }

    public boolean isReported() {
        return this.reported;
    }

    public boolean isScreenCaptureEnabled() {
        fg1 fg1Var = this.callParticipant;
        return fg1Var != null && fg1Var.c.b;
    }

    public boolean isTalking() {
        fg1 fg1Var = this.callParticipant;
        return fg1Var != null && fg1Var.d();
    }

    public boolean isUseable() {
        fg1 fg1Var;
        return (!isReported() || (fg1Var = this.callParticipant) == null || fg1Var.a == null) ? false : true;
    }

    public boolean isVideoEnabled() {
        fg1 fg1Var = this.callParticipant;
        return fg1Var != null && fg1Var.c.f;
    }

    public void setCallParticipant(fg1 fg1Var, LocalIdMappings localIdMappings) {
        this.callParticipant = fg1Var;
        if (fg1Var != null) {
            this.internalId = fg1Var.a;
        }
        localIdMappings.addMappings(this);
    }

    public void setDeviceIndex(int i, LocalIdMappings localIdMappings) {
        bg1 bg1Var;
        GlobalRTCLogger globalRTCLogger = GlobalRTCLogger.INSTANCE;
        StringBuilder sbN = rh4.n(i, "updateDeviceIndex ", " for ");
        sbN.append(this.externalId);
        GlobalRTCLogger.log(LOG_TAG, sbN.toString());
        if (this.externalId != null) {
            ParticipantId participantId = this.externalId;
            this.externalId = new ParticipantId(participantId.id, participantId.isAnon, i);
        }
        bg1 bg1Var2 = this.internalId;
        if (bg1Var2 != null) {
            this.internalId = new bg1(bg1Var2.b, i, bg1Var2.a);
        }
        fg1 fg1Var = this.callParticipant;
        if (fg1Var != null && (bg1Var = fg1Var.a) != null) {
            fg1Var.a = new bg1(bg1Var.b, i, bg1Var.a);
            o61 o61Var = fg1Var.p;
            if (o61Var != null) {
                fg1Var.p = new o61(o61Var.a, o61Var.b, i);
            }
        }
        localIdMappings.addMappings(this);
    }

    public void setExternalId(ParticipantId participantId) {
        this.externalId = participantId;
    }

    public void setInternalId(bg1 bg1Var) {
        this.internalId = bg1Var;
        fg1 fg1Var = this.callParticipant;
        if (fg1Var != null) {
            fg1Var.a = bg1Var;
        }
    }

    public void setReported(boolean z) {
        this.reported = z;
    }

    public String toString() {
        return this.externalId + "|" + this.internalId + "|" + this.callParticipant;
    }
}
