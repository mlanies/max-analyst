package defpackage;

import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.layout.ConversationVideoTrackParticipantKey;

/* loaded from: classes.dex */
public final class ld1 {
    public final je7 a;

    public ld1(je7 je7Var) {
        this.a = je7Var;
    }

    public final hg1 a(Conversation conversation, ConversationParticipant conversationParticipant, boolean z, boolean z2) {
        int i;
        gg1 gg1VarB = mqa.b(conversationParticipant.getExternalId());
        rd8 audioOptionState = conversationParticipant.getAudioOptionState();
        rd8 videoOptionState = conversationParticipant.getVideoOptionState();
        rd8 screenshareOptionState = conversationParticipant.getScreenshareOptionState();
        boolean zIsAudioEnabled = conversationParticipant.isAudioEnabled();
        boolean zBooleanValue = (z && conversationParticipant.isScreenCaptureEnabled()) ? ((Boolean) ((xuc) this.a.getValue()).b.getValue()).booleanValue() : false;
        llf llfVar = new llf(conversationParticipant.isVideoEnabled(), new ConversationVideoTrackParticipantKey.Builder().setParticipantId(conversationParticipant.getExternalId()).setType(olf.a).build(), z);
        llf llfVar2 = new llf(conversationParticipant.isScreenCaptureEnabled(), new ConversationVideoTrackParticipantKey.Builder().setParticipantId(conversationParticipant.getExternalId()).setType(olf.b).build(), false);
        boolean zIsCallAccepted = conversationParticipant.isCallAccepted();
        long acceptCallEpochMs = conversationParticipant.getAcceptCallEpochMs();
        boolean zIsConnected = conversationParticipant.isConnected();
        boolean zIsPrimarySpeaker = conversationParticipant.isPrimarySpeaker();
        boolean zIsTalking = conversationParticipant.isTalking();
        boolean zIsHandRaised = conversation.getParticipantStatesManager().isHandRaised(conversationParticipant.getExternalId());
        boolean zIsCreator = conversationParticipant.isCreator();
        boolean zIsAdmin = conversationParticipant.isAdmin();
        List<zc9> movies = conversationParticipant.getMovies();
        boolean zHasRegisteredPeers = conversationParticipant.hasRegisteredPeers();
        boolean z3 = conversation.getParticipantMediaStat(conversationParticipant) != null;
        int iOrdinal = conversationParticipant.getNetworkStatus().ordinal();
        if (iOrdinal == 0) {
            i = 1;
        } else if (iOrdinal == 1) {
            i = 2;
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = 3;
        }
        return new hg1(gg1VarB, audioOptionState, videoOptionState, screenshareOptionState, zIsAudioEnabled, zBooleanValue, llfVar, llfVar2, zIsCreator, zIsAdmin, z2, zIsConnected, zIsCallAccepted, acceptCallEpochMs, z, zIsPrimarySpeaker, zIsTalking, zIsHandRaised, zHasRegisteredPeers, z3, movies, i);
    }
}
