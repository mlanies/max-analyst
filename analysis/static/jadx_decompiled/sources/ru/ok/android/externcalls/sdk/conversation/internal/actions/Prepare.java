package ru.ok.android.externcalls.sdk.conversation.internal.actions;

import defpackage.a4c;
import defpackage.ag1;
import defpackage.b66;
import defpackage.ce;
import defpackage.d66;
import defpackage.e5f;
import defpackage.gd1;
import defpackage.gw3;
import defpackage.hw3;
import defpackage.ib3;
import defpackage.iqd;
import defpackage.k56;
import defpackage.k7d;
import defpackage.ol0;
import defpackage.pa3;
import defpackage.qj3;
import defpackage.rd7;
import defpackage.rqd;
import defpackage.tma;
import defpackage.tpa;
import defpackage.wz4;
import defpackage.x53;
import defpackage.z84;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.externcalls.sdk.api.ConversationParams;
import ru.ok.android.externcalls.sdk.api.OkApiService;
import ru.ok.android.externcalls.sdk.api.retry.RetryKt;
import ru.ok.android.externcalls.sdk.conversation.StartCallApiParams;
import ru.ok.android.externcalls.sdk.id.ExternalIdsResolver;
import ru.ok.android.externcalls.sdk.id.InternalIdsResolver;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.id.peer.PeerIdGenerator;
import ru.ok.android.externcalls.sdk.stat.warmup.ConversationPreparedStat;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0000\u0018\u0000 B2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003BCDBi\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u0014\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00030\u001dH\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ)\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d\"\b\b\u0000\u0010!*\u00020 *\b\u0012\u0004\u0012\u00028\u00000\u001dH\u0002¢\u0006\u0004\b\"\u0010#J)\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00030\u001d2\b\u0010%\u001a\u0004\u0018\u00010$2\b\u0010&\u001a\u0004\u0018\u00010$H\u0003¢\u0006\u0004\b'\u0010(J7\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00030\u001d2\u0006\u0010)\u001a\u00020\u00142\u0018\u0010,\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0+0\u001d0*H\u0002¢\u0006\u0004\b-\u0010.J7\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00030\u001d2\u0006\u0010)\u001a\u00020\u00142\u0018\u0010,\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0+0\u001d0*H\u0002¢\u0006\u0004\b/\u0010.J/\u00100\u001a\b\u0012\u0004\u0012\u00020\u00030\u001d2\u0018\u0010,\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0+0\u001d0*H\u0002¢\u0006\u0004\b0\u00101J7\u00103\u001a\u0010\u0012\f\u0012\n 2*\u0004\u0018\u00010\u00030\u00030\u001d2\u0018\u0010,\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0+0\u001d0*H\u0002¢\u0006\u0004\b3\u00101J\u001d\u00105\u001a\b\u0012\u0004\u0012\u00020\u00030\u001d2\u0006\u00104\u001a\u00020\u0002H\u0016¢\u0006\u0004\b5\u00106R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00107R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00108R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00109R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010:R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010;R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010<R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010=R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010>R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010?R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010?R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010@R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010A¨\u0006E"}, d2 = {"Lru/ok/android/externcalls/sdk/conversation/internal/actions/Prepare;", "Lru/ok/android/externcalls/sdk/conversation/internal/actions/Action;", "Lru/ok/android/externcalls/sdk/conversation/internal/actions/Prepare$PrepareParams;", "Lru/ok/android/externcalls/sdk/conversation/internal/actions/Prepare$PrepareResult;", "Lru/ok/android/externcalls/sdk/api/OkApiService;", "okApiService", "Lgw3;", "cidProvider", "Lru/ok/android/externcalls/sdk/api/ConversationParams;", "providedParams", "Lru/ok/android/externcalls/sdk/id/InternalIdsResolver;", "internalIdsResolver", "Lru/ok/android/externcalls/sdk/id/ExternalIdsResolver;", "externalIdsResolver", "Lru/ok/android/externcalls/sdk/conversation/StartCallApiParams;", "startCallApiParams", "Lru/ok/android/externcalls/sdk/id/peer/PeerIdGenerator;", "peerIdGenerator", "Lru/ok/android/externcalls/sdk/stat/warmup/ConversationPreparedStat;", "preparedStat", "", "isAnswer", "isCaller", "La4c;", "log", "Lag1;", "callParams", "<init>", "(Lru/ok/android/externcalls/sdk/api/OkApiService;Lgw3;Lru/ok/android/externcalls/sdk/api/ConversationParams;Lru/ok/android/externcalls/sdk/id/InternalIdsResolver;Lru/ok/android/externcalls/sdk/id/ExternalIdsResolver;Lru/ok/android/externcalls/sdk/conversation/StartCallApiParams;Lru/ok/android/externcalls/sdk/id/peer/PeerIdGenerator;Lru/ok/android/externcalls/sdk/stat/warmup/ConversationPreparedStat;ZZLa4c;Lag1;)V", "Liqd;", "executeSimple", "()Liqd;", "", "T", "retryForApiCall", "(Liqd;)Liqd;", "", "initialJoinLink", "anonToken", "executeWithJoinLink", "(Ljava/lang/String;Ljava/lang/String;)Liqd;", "isJoinByLink", "Lkotlin/Function0;", "Ltma;", "apiRequest", "prepareImpl", "(ZLk56;)Liqd;", "getPrepareResult", "getPrepareResultWithoutInternalIds", "(Lk56;)Liqd;", "kotlin.jvm.PlatformType", "getPrepareResultWithInternalIds", "params", "execute", "(Lru/ok/android/externcalls/sdk/conversation/internal/actions/Prepare$PrepareParams;)Liqd;", "Lru/ok/android/externcalls/sdk/api/OkApiService;", "Lgw3;", "Lru/ok/android/externcalls/sdk/api/ConversationParams;", "Lru/ok/android/externcalls/sdk/id/InternalIdsResolver;", "Lru/ok/android/externcalls/sdk/id/ExternalIdsResolver;", "Lru/ok/android/externcalls/sdk/conversation/StartCallApiParams;", "Lru/ok/android/externcalls/sdk/id/peer/PeerIdGenerator;", "Lru/ok/android/externcalls/sdk/stat/warmup/ConversationPreparedStat;", "Z", "La4c;", "Lag1;", "Companion", "PrepareParams", "PrepareResult", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class Prepare implements Action<PrepareParams, PrepareResult> {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final String TAG = "ConversationPrepare";
    private final ag1 callParams;
    private final gw3 cidProvider;
    private final ExternalIdsResolver externalIdsResolver;
    private final InternalIdsResolver internalIdsResolver;
    private final boolean isAnswer;
    private final boolean isCaller;
    private final a4c log;
    private final OkApiService okApiService;
    private final PeerIdGenerator peerIdGenerator;
    private final ConversationPreparedStat preparedStat;
    private final ConversationParams providedParams;
    private final StartCallApiParams startCallApiParams;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lru/ok/android/externcalls/sdk/conversation/internal/actions/Prepare$Companion;", "", "()V", "TAG", "", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(z84 z84Var) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/conversation/internal/actions/Prepare$PrepareParams;", "Lru/ok/android/externcalls/sdk/conversation/internal/actions/ActionParams;", "Prepare", "PrepareJoin", "Lru/ok/android/externcalls/sdk/conversation/internal/actions/Prepare$PrepareParams$Prepare;", "Lru/ok/android/externcalls/sdk/conversation/internal/actions/Prepare$PrepareParams$PrepareJoin;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface PrepareParams extends ActionParams {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lru/ok/android/externcalls/sdk/conversation/internal/actions/Prepare$PrepareParams$Prepare;", "Lru/ok/android/externcalls/sdk/conversation/internal/actions/Prepare$PrepareParams;", "()V", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: ru.ok.android.externcalls.sdk.conversation.internal.actions.Prepare$PrepareParams$Prepare, reason: collision with other inner class name */
        public static final class C0003Prepare implements PrepareParams {
            public static final C0003Prepare INSTANCE = new C0003Prepare();

            private C0003Prepare() {
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lru/ok/android/externcalls/sdk/conversation/internal/actions/Prepare$PrepareParams$PrepareJoin;", "Lru/ok/android/externcalls/sdk/conversation/internal/actions/Prepare$PrepareParams;", "initialJoinLink", "", "anonToken", "(Ljava/lang/String;Ljava/lang/String;)V", "getAnonToken", "()Ljava/lang/String;", "getInitialJoinLink", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class PrepareJoin implements PrepareParams {
            private final String anonToken;
            private final String initialJoinLink;

            public PrepareJoin(String str, String str2) {
                this.initialJoinLink = str;
                this.anonToken = str2;
            }

            public static /* synthetic */ PrepareJoin copy$default(PrepareJoin prepareJoin, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = prepareJoin.initialJoinLink;
                }
                if ((i & 2) != 0) {
                    str2 = prepareJoin.anonToken;
                }
                return prepareJoin.copy(str, str2);
            }

            /* renamed from: component1, reason: from getter */
            public final String getInitialJoinLink() {
                return this.initialJoinLink;
            }

            /* renamed from: component2, reason: from getter */
            public final String getAnonToken() {
                return this.anonToken;
            }

            public final PrepareJoin copy(String initialJoinLink, String anonToken) {
                return new PrepareJoin(initialJoinLink, anonToken);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof PrepareJoin)) {
                    return false;
                }
                PrepareJoin prepareJoin = (PrepareJoin) other;
                return tpa.f(this.initialJoinLink, prepareJoin.initialJoinLink) && tpa.f(this.anonToken, prepareJoin.anonToken);
            }

            public final String getAnonToken() {
                return this.anonToken;
            }

            public final String getInitialJoinLink() {
                return this.initialJoinLink;
            }

            public int hashCode() {
                String str = this.initialJoinLink;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.anonToken;
                return iHashCode + (str2 != null ? str2.hashCode() : 0);
            }

            public String toString() {
                return k7d.j("PrepareJoin(initialJoinLink=", this.initialJoinLink, ", anonToken=", this.anonToken, ")");
            }
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J%\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lru/ok/android/externcalls/sdk/conversation/internal/actions/Prepare$PrepareResult;", "Lru/ok/android/externcalls/sdk/conversation/internal/actions/ActionResult;", "conversationParams", "Lru/ok/android/externcalls/sdk/api/ConversationParams;", "unresolvedParticipantIds", "", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "(Lru/ok/android/externcalls/sdk/api/ConversationParams;Ljava/util/Set;)V", "getConversationParams", "()Lru/ok/android/externcalls/sdk/api/ConversationParams;", "getUnresolvedParticipantIds", "()Ljava/util/Set;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PrepareResult implements ActionResult {
        private final ConversationParams conversationParams;
        private final Set<ParticipantId> unresolvedParticipantIds;

        public PrepareResult(ConversationParams conversationParams, Set<ParticipantId> set) {
            this.conversationParams = conversationParams;
            this.unresolvedParticipantIds = set;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PrepareResult copy$default(PrepareResult prepareResult, ConversationParams conversationParams, Set set, int i, Object obj) {
            if ((i & 1) != 0) {
                conversationParams = prepareResult.conversationParams;
            }
            if ((i & 2) != 0) {
                set = prepareResult.unresolvedParticipantIds;
            }
            return prepareResult.copy(conversationParams, set);
        }

        /* renamed from: component1, reason: from getter */
        public final ConversationParams getConversationParams() {
            return this.conversationParams;
        }

        public final Set<ParticipantId> component2() {
            return this.unresolvedParticipantIds;
        }

        public final PrepareResult copy(ConversationParams conversationParams, Set<ParticipantId> unresolvedParticipantIds) {
            return new PrepareResult(conversationParams, unresolvedParticipantIds);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PrepareResult)) {
                return false;
            }
            PrepareResult prepareResult = (PrepareResult) other;
            return tpa.f(this.conversationParams, prepareResult.conversationParams) && tpa.f(this.unresolvedParticipantIds, prepareResult.unresolvedParticipantIds);
        }

        public final ConversationParams getConversationParams() {
            return this.conversationParams;
        }

        public final Set<ParticipantId> getUnresolvedParticipantIds() {
            return this.unresolvedParticipantIds;
        }

        public int hashCode() {
            ConversationParams conversationParams = this.conversationParams;
            return this.unresolvedParticipantIds.hashCode() + ((conversationParams == null ? 0 : conversationParams.hashCode()) * 31);
        }

        public String toString() {
            return "PrepareResult(conversationParams=" + this.conversationParams + ", unresolvedParticipantIds=" + this.unresolvedParticipantIds + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Liqd;", "Ltma;", "Lru/ok/android/externcalls/sdk/api/ConversationParams;", "invoke", "()Liqd;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.ok.android.externcalls.sdk.conversation.internal.actions.Prepare$executeSimple$1, reason: invalid class name */
    public static final class AnonymousClass1 extends rd7 implements k56 {
        public AnonymousClass1() {
            super(0);
        }

        @Override // defpackage.k56
        public final iqd invoke() {
            if (Prepare.this.providedParams == null && !Prepare.this.isCaller) {
                Prepare prepare = Prepare.this;
                return prepare.retryForApiCall(prepare.okApiService.getConversationParams(null, Prepare.this.isAnswer ? ((hw3) Prepare.this.cidProvider).a : null)).h(new b66() { // from class: ru.ok.android.externcalls.sdk.conversation.internal.actions.Prepare.executeSimple.1.2
                    @Override // defpackage.b66
                    /* renamed from: apply, reason: merged with bridge method [inline-methods] */
                    public final tma mo131apply(ConversationParams conversationParams) {
                        return new tma(conversationParams);
                    }
                });
            }
            ConversationParams conversationParams = Prepare.this.providedParams;
            tma tmaVar = conversationParams != null ? new tma(conversationParams) : null;
            if (tmaVar == null) {
                tmaVar = tma.b;
            }
            return iqd.g(tmaVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Liqd;", "Ltma;", "Lru/ok/android/externcalls/sdk/api/ConversationParams;", "invoke", "()Liqd;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.ok.android.externcalls.sdk.conversation.internal.actions.Prepare$executeWithJoinLink$1, reason: invalid class name and case insensitive filesystem */
    public static final class C00351 extends rd7 implements k56 {
        final /* synthetic */ String $anonToken;
        final /* synthetic */ String $initialJoinLink;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00351(String str, String str2) {
            super(0);
            this.$initialJoinLink = str;
            this.$anonToken = str2;
        }

        @Override // defpackage.k56
        public final iqd invoke() {
            iqd iqdVarRetryApiCallForJoining = RetryKt.retryApiCallForJoining(Prepare.this.okApiService.getJoinConversationParamsExt(this.$initialJoinLink, this.$anonToken, Prepare.this.peerIdGenerator.generatePeerId(), Prepare.this.startCallApiParams), Prepare.this.callParams.B.h, Prepare.this.log);
            final Prepare prepare = Prepare.this;
            qj3 qj3Var = new qj3() { // from class: ru.ok.android.externcalls.sdk.conversation.internal.actions.Prepare.executeWithJoinLink.1.1
                @Override // defpackage.qj3
                public final void accept(ConversationParams conversationParams) {
                    Prepare prepare2 = prepare;
                    if (conversationParams.id != null) {
                        gw3 gw3Var = prepare2.cidProvider;
                        String str = conversationParams.id;
                        if (gw3Var instanceof hw3) {
                            ((hw3) gw3Var).a = str;
                        }
                    }
                }
            };
            iqdVarRetryApiCallForJoining.getClass();
            return new rqd(iqdVarRetryApiCallForJoining, qj3Var, 2).h(new b66() { // from class: ru.ok.android.externcalls.sdk.conversation.internal.actions.Prepare.executeWithJoinLink.1.2
                @Override // defpackage.b66
                /* renamed from: apply, reason: merged with bridge method [inline-methods] */
                public final tma mo131apply(ConversationParams conversationParams) {
                    return new tma(conversationParams);
                }
            });
        }
    }

    public Prepare(OkApiService okApiService, gw3 gw3Var, ConversationParams conversationParams, InternalIdsResolver internalIdsResolver, ExternalIdsResolver externalIdsResolver, StartCallApiParams startCallApiParams, PeerIdGenerator peerIdGenerator, ConversationPreparedStat conversationPreparedStat, boolean z, boolean z2, a4c a4cVar, ag1 ag1Var) {
        this.okApiService = okApiService;
        this.cidProvider = gw3Var;
        this.providedParams = conversationParams;
        this.internalIdsResolver = internalIdsResolver;
        this.externalIdsResolver = externalIdsResolver;
        this.startCallApiParams = startCallApiParams;
        this.peerIdGenerator = peerIdGenerator;
        this.preparedStat = conversationPreparedStat;
        this.isAnswer = z;
        this.isCaller = z2;
        this.log = a4cVar;
        this.callParams = ag1Var;
    }

    private final iqd executeSimple() {
        return prepareImpl(false, new AnonymousClass1());
    }

    private final iqd executeWithJoinLink(String initialJoinLink, String anonToken) {
        return prepareImpl(true, new C00351(initialJoinLink, anonToken));
    }

    private final iqd getPrepareResult(boolean isJoinByLink, k56 apiRequest) {
        return (this.callParams.B.j && (this.isCaller || isJoinByLink)) ? getPrepareResultWithoutInternalIds(apiRequest) : getPrepareResultWithInternalIds(apiRequest);
    }

    private final iqd getPrepareResultWithInternalIds(k56 apiRequest) {
        iqd iqdVar = (iqd) apiRequest.invoke();
        iqd iqdVarRetryForApiCall = retryForApiCall(this.internalIdsResolver.resolveIdsAndGetFailed());
        ExternalIdsResolver externalIdsResolver = this.externalIdsResolver;
        pa3 pa3VarResolveIds = externalIdsResolver.resolveIds(externalIdsResolver.collectExternalIdResolutionCandidates());
        e5f e5fVar = e5f.a;
        pa3VarResolveIds.getClass();
        iqd iqdVarRetryForApiCall2 = retryForApiCall(new ib3(pa3VarResolveIds, 0, e5fVar));
        d66 d66Var = new d66() { // from class: ru.ok.android.externcalls.sdk.conversation.internal.actions.Prepare.getPrepareResultWithInternalIds.1
            @Override // defpackage.d66
            public final PrepareResult apply(tma tmaVar, Set<ParticipantId> set, e5f e5fVar2) {
                ConversationParams conversationParams;
                Object obj = tmaVar.a;
                if (obj == null) {
                    conversationParams = null;
                } else {
                    if (obj == null) {
                        throw new NoSuchElementException();
                    }
                    conversationParams = (ConversationParams) obj;
                }
                return new PrepareResult(conversationParams, x53.H0(x53.e0(set)));
            }
        };
        Objects.requireNonNull(iqdVar, "source1 is null");
        Objects.requireNonNull(iqdVarRetryForApiCall, "source2 is null");
        Objects.requireNonNull(iqdVarRetryForApiCall2, "source3 is null");
        Objects.requireNonNull(d66Var, "zipper is null");
        return new ib3(new iqd[]{iqdVar, iqdVarRetryForApiCall, iqdVarRetryForApiCall2}, 6, new gd1(11, d66Var));
    }

    private final iqd getPrepareResultWithoutInternalIds(k56 apiRequest) {
        return ((iqd) apiRequest.invoke()).h(new b66() { // from class: ru.ok.android.externcalls.sdk.conversation.internal.actions.Prepare.getPrepareResultWithoutInternalIds.1
            @Override // defpackage.b66
            /* renamed from: apply, reason: merged with bridge method [inline-methods] */
            public final PrepareResult mo131apply(tma tmaVar) {
                ConversationParams conversationParams;
                Object obj = tmaVar.a;
                if (obj == null) {
                    conversationParams = null;
                } else {
                    if (obj == null) {
                        throw new NoSuchElementException();
                    }
                    conversationParams = (ConversationParams) obj;
                }
                return new PrepareResult(conversationParams, wz4.a);
            }
        });
    }

    private final iqd prepareImpl(boolean isJoinByLink, k56 apiRequest) {
        return new ib3(getPrepareResult(isJoinByLink, apiRequest).i(ce.a()), 5, new ol0() { // from class: ru.ok.android.externcalls.sdk.conversation.internal.actions.Prepare.prepareImpl.1
            @Override // defpackage.ol0
            public final void accept(PrepareResult prepareResult, Throwable th) {
                Prepare.this.preparedStat.onConversationPrepared();
                if (th != null) {
                    Prepare.this.log.logException(Prepare.TAG, "Conversation prepare failed", th);
                } else {
                    Prepare.this.log.log(Prepare.TAG, "Conversation prepared");
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T> iqd retryForApiCall(iqd iqdVar) {
        return this.isAnswer ? RetryKt.retryApiCallForIncoming(iqdVar, this.callParams.B.h, this.log) : RetryKt.retryApiCallForOutgoing(iqdVar, this.callParams.B.h, this.log);
    }

    @Override // ru.ok.android.externcalls.sdk.conversation.internal.actions.Action
    public iqd execute(PrepareParams params) {
        if (params instanceof PrepareParams.C0003Prepare) {
            return executeSimple();
        }
        if (!(params instanceof PrepareParams.PrepareJoin)) {
            throw new NoWhenBranchMatchedException();
        }
        PrepareParams.PrepareJoin prepareJoin = (PrepareParams.PrepareJoin) params;
        return executeWithJoinLink(prepareJoin.getInitialJoinLink(), prepareJoin.getAnonToken());
    }
}
