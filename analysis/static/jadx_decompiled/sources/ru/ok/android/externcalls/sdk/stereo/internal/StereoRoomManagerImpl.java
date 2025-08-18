package ru.ok.android.externcalls.sdk.stereo.internal;

import defpackage.a4c;
import defpackage.abd;
import defpackage.bg1;
import defpackage.bq1;
import defpackage.e5f;
import defpackage.eg1;
import defpackage.ewc;
import defpackage.fg1;
import defpackage.k56;
import defpackage.m56;
import defpackage.mp1;
import defpackage.np1;
import defpackage.oj3;
import defpackage.op1;
import defpackage.pp1;
import defpackage.rd7;
import defpackage.vte;
import defpackage.x53;
import defpackage.yg3;
import defpackage.yh0;
import defpackage.z84;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.id.IdMappingWrapper;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.id.mapping.IdMappingResolver;
import ru.ok.android.externcalls.sdk.participant.collection.ParticipantStore;
import ru.ok.android.externcalls.sdk.stereo.StereoRoomManager;
import ru.ok.android.externcalls.sdk.stereo.hands.StereoRoomHandsQueueImpl;
import ru.ok.android.externcalls.sdk.stereo.internal.command.StereoRoomCommandExecutor;
import ru.ok.android.externcalls.sdk.stereo.internal.listener.StereoRoomListenerManagerImpl;
import ru.ok.android.externcalls.sdk.stereo.listener.StereoRoomListenerManager;
import ru.ok.android.externcalls.sdk.stereo.listener.StereoRoomManagerListener;

@Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 d2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002deBG\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0096\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ3\u0010 \u001a\u00020\u00182\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00180\u001b2\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001dH\u0016¢\u0006\u0004\b \u0010!J3\u0010\"\u001a\u00020\u00182\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00180\u001b2\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001dH\u0016¢\u0006\u0004\b\"\u0010!J3\u0010#\u001a\u00020\u00182\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00180\u001b2\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001dH\u0016¢\u0006\u0004\b#\u0010!J3\u0010$\u001a\u00020\u00182\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00180\u001b2\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001dH\u0016¢\u0006\u0004\b$\u0010!J?\u0010(\u001a\u00020\u00182\n\u0010'\u001a\u00060%j\u0002`&2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00180\u001b2\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001dH\u0016¢\u0006\u0004\b(\u0010)J?\u0010*\u001a\u00020\u00182\n\u0010'\u001a\u00060%j\u0002`&2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00180\u001b2\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001dH\u0016¢\u0006\u0004\b*\u0010)J?\u0010+\u001a\u00020\u00182\n\u0010'\u001a\u00060%j\u0002`&2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00180\u001b2\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001dH\u0016¢\u0006\u0004\b+\u0010)J?\u0010,\u001a\u00020\u00182\n\u0010'\u001a\u00060%j\u0002`&2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00180\u001b2\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001dH\u0016¢\u0006\u0004\b,\u0010)J\u0017\u0010-\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b-\u0010\u001aJ\u0017\u00100\u001a\u00020\u00182\u0006\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b0\u00101J\u0017\u00103\u001a\u00020\u00182\u0006\u0010/\u001a\u000202H\u0016¢\u0006\u0004\b3\u00104J\u0017\u00106\u001a\u00020\u00182\u0006\u0010/\u001a\u000205H\u0016¢\u0006\u0004\b6\u00107J\u0017\u00109\u001a\u00020\u00182\u0006\u0010/\u001a\u000208H\u0016¢\u0006\u0004\b9\u0010:J\u0017\u0010=\u001a\u00020\u00182\u0006\u0010<\u001a\u00020;H\u0016¢\u0006\u0004\b=\u0010>J?\u0010?\u001a\u00020\u00182\n\u0010'\u001a\u00060%j\u0002`&2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00180\u001b2\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001dH\u0016¢\u0006\u0004\b?\u0010)J?\u0010@\u001a\u00020\u00182\n\u0010'\u001a\u00060%j\u0002`&2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00180\u001b2\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001dH\u0016¢\u0006\u0004\b@\u0010)J?\u0010A\u001a\u00020\u00182\n\u0010'\u001a\u00060%j\u0002`&2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00180\u001b2\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001dH\u0002¢\u0006\u0004\bA\u0010)J#\u0010E\u001a\n\u0018\u00010Cj\u0004\u0018\u0001`D2\n\u0010B\u001a\u00060%j\u0002`&H\u0002¢\u0006\u0004\bE\u0010FJ#\u0010H\u001a\n\u0018\u00010%j\u0004\u0018\u0001`&2\n\u0010G\u001a\u00060Cj\u0002`DH\u0002¢\u0006\u0004\bH\u0010IJ/\u0010M\u001a\u00020\u00182\u0010\u0010K\u001a\f\u0012\b\u0012\u00060Cj\u0002`D0J2\f\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00180\u001bH\u0002¢\u0006\u0004\bM\u0010NJA\u0010O\u001a\u00020\u00182\n\u0010'\u001a\u00060%j\u0002`&2\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001b2\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001dH\u0002¢\u0006\u0004\bO\u0010)JI\u0010P\u001a\u00020\u00182\n\u0010'\u001a\u00060%j\u0002`&2\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001d2\u0016\u0010L\u001a\u0012\u0012\b\u0012\u00060Cj\u0002`D\u0012\u0004\u0012\u00020\u00180\u001dH\u0002¢\u0006\u0004\bP\u0010QJ1\u0010R\u001a\u00020\u00182\n\u0010'\u001a\u00060%j\u0002`&2\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001dH\u0002¢\u0006\u0004\bR\u0010SR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010TR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010UR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010VR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010WR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010XR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010YR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010ZR\u001a\u0010\\\u001a\u00020[8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_R$\u0010a\u001a\u00020;2\u0006\u0010`\u001a\u00020;8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\ba\u0010b\u001a\u0004\ba\u0010c¨\u0006f"}, d2 = {"Lru/ok/android/externcalls/sdk/stereo/internal/StereoRoomManagerImpl;", "Lru/ok/android/externcalls/sdk/stereo/StereoRoomManager;", "Lbq1;", "Lru/ok/android/externcalls/sdk/stereo/listener/StereoRoomListenerManager;", "La4c;", "logger", "Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;", "store", "Lru/ok/android/externcalls/sdk/id/mapping/IdMappingResolver;", "idResolver", "Lru/ok/android/externcalls/sdk/stereo/internal/StereoRoomManagerImpl$GrantRolesRequest;", "grantRolesRequest", "Lru/ok/android/externcalls/sdk/stereo/internal/command/StereoRoomCommandExecutor;", "commandExecutor", "Lru/ok/android/externcalls/sdk/id/IdMappingWrapper;", "idMappingWrapper", "Lru/ok/android/externcalls/sdk/stereo/internal/listener/StereoRoomListenerManagerImpl;", "listenersManager", "Lvte;", "timeProvider", "<init>", "(La4c;Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;Lru/ok/android/externcalls/sdk/id/mapping/IdMappingResolver;Lru/ok/android/externcalls/sdk/stereo/internal/StereoRoomManagerImpl$GrantRolesRequest;Lru/ok/android/externcalls/sdk/stereo/internal/command/StereoRoomCommandExecutor;Lru/ok/android/externcalls/sdk/id/IdMappingWrapper;Lru/ok/android/externcalls/sdk/stereo/internal/listener/StereoRoomListenerManagerImpl;Lvte;)V", "Lru/ok/android/externcalls/sdk/stereo/listener/StereoRoomManagerListener;", "listener", "Le5f;", "removeListener", "(Lru/ok/android/externcalls/sdk/stereo/listener/StereoRoomManagerListener;)V", "Lkotlin/Function0;", "onSuccess", "Lkotlin/Function1;", "", "onError", "requestPromotion", "(Lk56;Lm56;)V", "cancelPromotionRequest", "acceptPromotion", "rejectPromotion", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "participantId", "promoteParticipant", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;Lk56;Lm56;)V", "revokePromotion", "rejectPromotionRequest", "unpromoteParticipant", "addListener", "Lmp1;", "event", "onAttendee", "(Lmp1;)V", "Lop1;", "onHandUp", "(Lop1;)V", "Lnp1;", "onFeedback", "(Lnp1;)V", "Lpp1;", "onPromotionUpdated", "(Lpp1;)V", "", "isMeInWaitingRoom", "onMeInWaitingRoomChanged", "(Z)V", "grantAdmin", "revokeAdmin", "revokeRoles", "externalId", "Lbg1;", "Lru/ok/android/externcalls/sdk/id/InternalId;", "getInternalId", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;)Lbg1;", "internalId", "getExternalId", "(Lbg1;)Lru/ok/android/externcalls/sdk/id/ParticipantId;", "", "ids", "block", "resolveIdsAndThen", "(Ljava/util/List;Lk56;)V", "unpromoteParticipantImpl", "withInternalId", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;Lm56;Lm56;)V", "idNotResolved", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;Lm56;)V", "La4c;", "Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;", "Lru/ok/android/externcalls/sdk/id/mapping/IdMappingResolver;", "Lru/ok/android/externcalls/sdk/stereo/internal/StereoRoomManagerImpl$GrantRolesRequest;", "Lru/ok/android/externcalls/sdk/stereo/internal/command/StereoRoomCommandExecutor;", "Lru/ok/android/externcalls/sdk/id/IdMappingWrapper;", "Lru/ok/android/externcalls/sdk/stereo/internal/listener/StereoRoomListenerManagerImpl;", "Lru/ok/android/externcalls/sdk/stereo/hands/StereoRoomHandsQueueImpl;", "handsQueue", "Lru/ok/android/externcalls/sdk/stereo/hands/StereoRoomHandsQueueImpl;", "getHandsQueue", "()Lru/ok/android/externcalls/sdk/stereo/hands/StereoRoomHandsQueueImpl;", "<set-?>", "isMePromoted", "Z", "()Z", "Companion", "GrantRolesRequest", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class StereoRoomManagerImpl implements StereoRoomManager, bq1, StereoRoomListenerManager {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final String LOG_TAG = "StereoRoomManagerImpl";
    private final StereoRoomCommandExecutor commandExecutor;
    private final GrantRolesRequest grantRolesRequest;
    private final StereoRoomHandsQueueImpl handsQueue;
    private final IdMappingWrapper idMappingWrapper;
    private final IdMappingResolver idResolver;
    private boolean isMePromoted;
    private final StereoRoomListenerManagerImpl listenersManager;
    private final a4c logger;
    private final ParticipantStore store;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lru/ok/android/externcalls/sdk/stereo/internal/StereoRoomManagerImpl$Companion;", "", "()V", "LOG_TAG", "", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(z84 z84Var) {
            this();
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001JE\u0010\u000e\u001a\u00020\r2\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\nH&¢\u0006\u0004\b\u000e\u0010\u000fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/stereo/internal/StereoRoomManagerImpl$GrantRolesRequest;", "", "Lbg1;", "Lru/ok/android/externcalls/sdk/id/InternalId;", "participantId", "", "revoke", "", "Leg1;", "roles", "Ljava/lang/Runnable;", "onSuccess", "onError", "Le5f;", "grantRoles", "(Lbg1;Z[Leg1;Ljava/lang/Runnable;Ljava/lang/Runnable;)V", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
    public interface GrantRolesRequest {
        void grantRoles(bg1 participantId, boolean revoke, eg1[] roles, Runnable onSuccess, Runnable onError);
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Le5f;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.ok.android.externcalls.sdk.stereo.internal.StereoRoomManagerImpl$onAttendee$1, reason: invalid class name */
    public static final class AnonymousClass1 extends rd7 implements k56 {
        final /* synthetic */ mp1 $event;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(mp1 mp1Var) {
            super(0);
            this.$event = mp1Var;
        }

        @Override // defpackage.k56
        public /* bridge */ /* synthetic */ Object invoke() {
            m118invoke();
            return e5f.a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m118invoke() {
            StereoRoomListenerManagerImpl stereoRoomListenerManagerImpl = StereoRoomManagerImpl.this.listenersManager;
            mp1 mp1Var = this.$event;
            int i = mp1Var.a;
            List list = mp1Var.c;
            StereoRoomManagerImpl stereoRoomManagerImpl = StereoRoomManagerImpl.this;
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ParticipantId externalId = stereoRoomManagerImpl.getExternalId((bg1) it.next());
                if (externalId != null) {
                    arrayList.add(externalId);
                }
            }
            List list2 = this.$event.b;
            StereoRoomManagerImpl stereoRoomManagerImpl2 = StereoRoomManagerImpl.this;
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                ParticipantId externalId2 = stereoRoomManagerImpl2.getExternalId((bg1) it2.next());
                if (externalId2 != null) {
                    arrayList2.add(externalId2);
                }
            }
            stereoRoomListenerManagerImpl.onListenersChanged(new StereoRoomManagerListener.ListenersUpdated(i, arrayList2, arrayList));
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lbg1;", "Lru/ok/android/externcalls/sdk/id/InternalId;", "internalId", "Le5f;", "invoke", "(Lbg1;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.ok.android.externcalls.sdk.stereo.internal.StereoRoomManagerImpl$promoteParticipant$1, reason: invalid class name and case insensitive filesystem */
    public static final class C00431 extends rd7 implements m56 {
        final /* synthetic */ m56 $onError;
        final /* synthetic */ k56 $onSuccess;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00431(k56 k56Var, m56 m56Var) {
            super(1);
            this.$onSuccess = k56Var;
            this.$onError = m56Var;
        }

        @Override // defpackage.m56
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((bg1) obj);
            return e5f.a;
        }

        public final void invoke(bg1 bg1Var) {
            StereoRoomManagerImpl.this.commandExecutor.promoteParticipant(new StereoRoomCommandExecutor.PromoteParticipantParams(bg1Var, true), this.$onSuccess, this.$onError);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Le5f;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.ok.android.externcalls.sdk.stereo.internal.StereoRoomManagerImpl$unpromoteParticipant$1, reason: invalid class name and case insensitive filesystem */
    public static final class C00441 extends rd7 implements k56 {
        final /* synthetic */ m56 $onError;
        final /* synthetic */ k56 $onSuccess;
        final /* synthetic */ ParticipantId $participantId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00441(ParticipantId participantId, k56 k56Var, m56 m56Var) {
            super(0);
            this.$participantId = participantId;
            this.$onSuccess = k56Var;
            this.$onError = m56Var;
        }

        @Override // defpackage.k56
        public /* bridge */ /* synthetic */ Object invoke() {
            m119invoke();
            return e5f.a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m119invoke() {
            StereoRoomManagerImpl.this.unpromoteParticipantImpl(this.$participantId, this.$onSuccess, this.$onError);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lbg1;", "Lru/ok/android/externcalls/sdk/id/InternalId;", "internalId", "Le5f;", "invoke", "(Lbg1;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.ok.android.externcalls.sdk.stereo.internal.StereoRoomManagerImpl$unpromoteParticipantImpl$1, reason: invalid class name and case insensitive filesystem */
    public static final class C00451 extends rd7 implements m56 {
        final /* synthetic */ m56 $onError;
        final /* synthetic */ k56 $onSuccess;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00451(k56 k56Var, m56 m56Var) {
            super(1);
            this.$onSuccess = k56Var;
            this.$onError = m56Var;
        }

        @Override // defpackage.m56
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((bg1) obj);
            return e5f.a;
        }

        public final void invoke(bg1 bg1Var) {
            StereoRoomManagerImpl.this.commandExecutor.promoteParticipant(new StereoRoomCommandExecutor.PromoteParticipantParams(bg1Var, false), this.$onSuccess, this.$onError);
        }
    }

    public StereoRoomManagerImpl(a4c a4cVar, ParticipantStore participantStore, IdMappingResolver idMappingResolver, GrantRolesRequest grantRolesRequest, StereoRoomCommandExecutor stereoRoomCommandExecutor, IdMappingWrapper idMappingWrapper, StereoRoomListenerManagerImpl stereoRoomListenerManagerImpl, vte vteVar) {
        this.logger = a4cVar;
        this.store = participantStore;
        this.idResolver = idMappingResolver;
        this.grantRolesRequest = grantRolesRequest;
        this.commandExecutor = stereoRoomCommandExecutor;
        this.idMappingWrapper = idMappingWrapper;
        this.listenersManager = stereoRoomListenerManagerImpl;
        this.handsQueue = new StereoRoomHandsQueueImpl(stereoRoomCommandExecutor, new StereoRoomManagerImpl$handsQueue$1(this), new StereoRoomManagerImpl$handsQueue$2(this), stereoRoomListenerManagerImpl, vteVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ParticipantId getExternalId(bg1 internalId) {
        ParticipantId externalId;
        ConversationParticipant byInternal = this.store.getByInternal(internalId);
        return (byInternal == null || (externalId = byInternal.getExternalId()) == null) ? this.idMappingWrapper.getByInternal(internalId) : externalId;
    }

    private final bg1 getInternalId(ParticipantId externalId) {
        bg1 internalId;
        ConversationParticipant byExternal = this.store.getByExternal(externalId);
        return (byExternal == null || (internalId = byExternal.getInternalId()) == null) ? this.idMappingWrapper.getByExternal(externalId) : internalId;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void grantAdmin$lambda$2$lambda$1(m56 m56Var) {
        if (m56Var != null) {
            m56Var.invoke(new RuntimeException("Grant admin failed"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void idNotResolved(ParticipantId participantId, m56 onError) {
        if (onError != null) {
            onError.invoke(new RuntimeException("Can't resolve internal id of participant " + participantId));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void resolveIdsAndThen(List<bg1> ids, k56 block) {
        ArrayList arrayList = new ArrayList();
        for (bg1 bg1Var : ids) {
            if (getExternalId(bg1Var) == null) {
                arrayList.add(bg1Var);
            }
        }
        if (arrayList.isEmpty()) {
            block.invoke();
        } else {
            this.idResolver.resolveExternalsByInternalsIds(arrayList, new yh0(9, block), new yg3(this, arrayList, ids, block, 15));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void resolveIdsAndThen$lambda$10(StereoRoomManagerImpl stereoRoomManagerImpl, List list, List list2, k56 k56Var) {
        stereoRoomManagerImpl.logger.log(LOG_TAG, "Something went wrong during internal to external id list resolution");
        if (list.size() < list2.size()) {
            k56Var.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void revokeAdmin$lambda$5$lambda$4(m56 m56Var) {
        if (m56Var != null) {
            m56Var.invoke(new RuntimeException("Revoke admin failed"));
        }
    }

    private final void revokeRoles(ParticipantId participantId, k56 onSuccess, m56 onError) {
        ConversationParticipant byExternal = this.store.getByExternal(participantId);
        fg1 callParticipant = byExternal != null ? byExternal.getCallParticipant() : null;
        if (callParticipant == null) {
            onSuccess.invoke();
            return;
        }
        List list = callParticipant.e;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        eg1 eg1Var = eg1.b;
        if (list.contains(eg1Var)) {
            linkedHashSet.add(eg1Var);
        }
        eg1 eg1Var2 = eg1.c;
        if (list.contains(eg1Var2)) {
            linkedHashSet.add(eg1Var2);
        }
        if (linkedHashSet.isEmpty()) {
            onSuccess.invoke();
            return;
        }
        GrantRolesRequest grantRolesRequest = this.grantRolesRequest;
        bg1 bg1Var = callParticipant.a;
        if (bg1Var == null) {
            return;
        }
        grantRolesRequest.grantRoles(bg1Var, true, (eg1[]) linkedHashSet.toArray(new eg1[0]), new yh0(8, onSuccess), new abd(1, onError));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void revokeRoles$lambda$7(m56 m56Var) {
        if (m56Var != null) {
            m56Var.invoke(new RuntimeException("Revoke all roles failed"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void unpromoteParticipantImpl(ParticipantId participantId, k56 onSuccess, m56 onError) {
        withInternalId(participantId, onError, new C00451(onSuccess, onError));
    }

    private final void withInternalId(ParticipantId participantId, m56 onError, m56 block) {
        int i = 4;
        this.idResolver.withInternalId(participantId, new oj3(i, block), new ewc(this, participantId, onError, i));
    }

    @Override // ru.ok.android.externcalls.sdk.stereo.StereoRoomManager
    public void acceptPromotion(k56 onSuccess, m56 onError) {
        this.commandExecutor.acceptPromotion(new StereoRoomCommandExecutor.AcceptPromotionParams(false), onSuccess, onError);
    }

    @Override // ru.ok.android.externcalls.sdk.stereo.listener.StereoRoomListenerManager
    public void addListener(StereoRoomManagerListener listener) {
        this.listenersManager.addListener(listener);
        listener.onOwnPromotionChanged(getIsMePromoted());
    }

    @Override // ru.ok.android.externcalls.sdk.stereo.StereoRoomManager
    public void cancelPromotionRequest(k56 onSuccess, m56 onError) {
        this.commandExecutor.requestPromotion(new StereoRoomCommandExecutor.RequestPromotionParams(true), onSuccess, onError);
    }

    @Override // ru.ok.android.externcalls.sdk.stereo.StereoRoomManager
    public void grantAdmin(ParticipantId participantId, k56 onSuccess, m56 onError) {
        bg1 internalId = getInternalId(participantId);
        if (internalId != null) {
            this.grantRolesRequest.grantRoles(internalId, false, new eg1[]{eg1.b}, new yh0(10, onSuccess), new abd(2, onError));
        }
    }

    @Override // ru.ok.android.externcalls.sdk.stereo.StereoRoomManager
    /* renamed from: isMePromoted, reason: from getter */
    public boolean getIsMePromoted() {
        return this.isMePromoted;
    }

    @Override // defpackage.bq1
    public void onAttendee(mp1 event) {
        resolveIdsAndThen(x53.t0(event.b, event.c), new AnonymousClass1(event));
    }

    @Override // defpackage.bq1
    public void onFeedback(np1 event) {
    }

    @Override // defpackage.bq1
    public void onHandUp(op1 event) {
        getHandsQueue().onHandUp(event);
    }

    @Override // defpackage.bq1
    public void onMeInWaitingRoomChanged(boolean isMeInWaitingRoom) {
        this.isMePromoted = !isMeInWaitingRoom;
        this.listenersManager.onOwnPromotionChanged(getIsMePromoted());
    }

    @Override // defpackage.bq1
    public void onPromotionUpdated(pp1 event) {
        this.listenersManager.onPromotionRequestUpdated(new StereoRoomManagerListener.PromotionRequestUpdated(event.a));
    }

    @Override // ru.ok.android.externcalls.sdk.stereo.StereoRoomManager
    public void promoteParticipant(ParticipantId participantId, k56 onSuccess, m56 onError) {
        withInternalId(participantId, onError, new C00431(onSuccess, onError));
    }

    @Override // ru.ok.android.externcalls.sdk.stereo.StereoRoomManager
    public void rejectPromotion(k56 onSuccess, m56 onError) {
        this.commandExecutor.acceptPromotion(new StereoRoomCommandExecutor.AcceptPromotionParams(true), onSuccess, onError);
    }

    @Override // ru.ok.android.externcalls.sdk.stereo.StereoRoomManager
    public void rejectPromotionRequest(ParticipantId participantId, k56 onSuccess, m56 onError) {
        unpromoteParticipantImpl(participantId, onSuccess, onError);
    }

    @Override // ru.ok.android.externcalls.sdk.stereo.listener.StereoRoomListenerManager
    public void removeListener(StereoRoomManagerListener listener) {
        this.listenersManager.removeListener(listener);
    }

    @Override // ru.ok.android.externcalls.sdk.stereo.StereoRoomManager
    public void requestPromotion(k56 onSuccess, m56 onError) {
        this.commandExecutor.requestPromotion(new StereoRoomCommandExecutor.RequestPromotionParams(false), onSuccess, onError);
    }

    @Override // ru.ok.android.externcalls.sdk.stereo.StereoRoomManager
    public void revokeAdmin(ParticipantId participantId, k56 onSuccess, m56 onError) {
        bg1 internalId = getInternalId(participantId);
        if (internalId != null) {
            this.grantRolesRequest.grantRoles(internalId, true, new eg1[]{eg1.b}, new yh0(11, onSuccess), new abd(3, onError));
        }
    }

    @Override // ru.ok.android.externcalls.sdk.stereo.StereoRoomManager
    public void revokePromotion(ParticipantId participantId, k56 onSuccess, m56 onError) {
        unpromoteParticipantImpl(participantId, onSuccess, onError);
    }

    @Override // ru.ok.android.externcalls.sdk.stereo.StereoRoomManager
    public void unpromoteParticipant(ParticipantId participantId, k56 onSuccess, m56 onError) {
        revokeRoles(participantId, new C00441(participantId, onSuccess, onError), onError);
    }

    @Override // ru.ok.android.externcalls.sdk.stereo.StereoRoomManager
    public StereoRoomHandsQueueImpl getHandsQueue() {
        return this.handsQueue;
    }
}
