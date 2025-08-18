package ru.ok.android.externcalls.sdk;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.work.WorkRequest;
import defpackage.a4c;
import defpackage.b46;
import defpackage.b4c;
import defpackage.bg1;
import defpackage.bi;
import defpackage.db7;
import defpackage.dnc;
import defpackage.dw3;
import defpackage.fc3;
import defpackage.fze;
import defpackage.glc;
import defpackage.h7b;
import defpackage.hc3;
import defpackage.hl;
import defpackage.iq1;
import defpackage.iqd;
import defpackage.ji6;
import defpackage.k56;
import defpackage.kl;
import defpackage.m56;
import defpackage.nl;
import defpackage.nsa;
import defpackage.od2;
import defpackage.psa;
import defpackage.q2a;
import defpackage.ql;
import defpackage.qpc;
import defpackage.qsa;
import defpackage.r38;
import defpackage.rj3;
import defpackage.rk0;
import defpackage.rl;
import defpackage.se3;
import defpackage.sk0;
import defpackage.tu0;
import defpackage.uf0;
import defpackage.v02;
import defpackage.xf1;
import defpackage.xye;
import defpackage.y3c;
import defpackage.yf1;
import defpackage.yuc;
import defpackage.yv3;
import defpackage.z3c;
import defpackage.zf1;
import java.io.IOException;
import java.time.Clock;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import one.me.sdk.richvector.EnhancedAnimatedVectorDrawable;
import org.webrtc.NativeLibraryLoader;
import ru.ok.android.api.json.JsonParseException;
import ru.ok.android.externcalls.analytics.CallAnalyticsSender;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.ConversationFactory;
import ru.ok.android.externcalls.sdk.ConversationFactoryInitParams;
import ru.ok.android.externcalls.sdk.analytics.CallAnalyticsInitializer;
import ru.ok.android.externcalls.sdk.analytics.ConversationAnalyticsSender;
import ru.ok.android.externcalls.sdk.analytics.internal.ConversationAnalyticsSenderImpl;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.android.externcalls.sdk.api.ConversationParams;
import ru.ok.android.externcalls.sdk.api.OkApiService;
import ru.ok.android.externcalls.sdk.api.log.LoggingApiRequestDebugger;
import ru.ok.android.externcalls.sdk.api.retry.RetryKt;
import ru.ok.android.externcalls.sdk.api.session.InMemorySessionStore;
import ru.ok.android.externcalls.sdk.chat.ChatStateListener;
import ru.ok.android.externcalls.sdk.connection.MediaConnectionSettings;
import ru.ok.android.externcalls.sdk.factory.AnswerCallParams;
import ru.ok.android.externcalls.sdk.factory.CreateConfParams;
import ru.ok.android.externcalls.sdk.factory.JoinAnonByLinkParams;
import ru.ok.android.externcalls.sdk.factory.JoinByLinkParams;
import ru.ok.android.externcalls.sdk.factory.JoinCallParams;
import ru.ok.android.externcalls.sdk.factory.StartCallParams;
import ru.ok.android.externcalls.sdk.factory.internal.RTCLogWrapper;
import ru.ok.android.externcalls.sdk.id.IdMappingWrapper;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.id.mapping.IdsMapper;
import ru.ok.android.externcalls.sdk.log.ExtLogger;
import ru.ok.android.externcalls.sdk.log.GlobalRTCLogger;
import ru.ok.android.externcalls.sdk.log.stat.ProductStatisticsManagerImpl;
import ru.ok.android.externcalls.sdk.log.stat.StatisticsManager;
import ru.ok.android.externcalls.sdk.log.stat.item.ProductStatItem;
import ru.ok.android.externcalls.sdk.rate.rtt.RttRateHintConfig;

/* loaded from: classes2.dex */
public class ConversationFactory {
    private static final String DEFAULT_APP_VERSION = "sdk-sdk-125.1.0.48.3";
    private static final String LOG_TAG = "ConversationFactory";
    public static final String SDK_VERSION = "sdk-125.1.0.48.3";
    private static final ExecutorService WEBRTC_EXECUTOR = Executors.newSingleThreadExecutor();
    private static volatile boolean initDone = false;
    private List<String> additionalWhitelistedCodecPrefixes;
    private bi animojiDataSupplier;
    private final q2a api;
    private String appVersion;
    private String[] audioCodecs;
    private int audioLevelFrequencyMs;
    private uf0 badNetworkIndicatorConfig;
    private xf1 bitrates;
    private final CallAnalyticsSender callAnalyticsSender;
    private ChatStateListener chatStateListener;
    private final String clientType;
    private final Context context;
    private final ConversationAnalyticsSenderImpl conversationAnalyticsSender;
    private boolean dataChannelScreenshareRecvEnabled;
    private boolean dataChannelScreenshareSendEnabled;
    private final ExtLogger defaultStat;
    private final hc3 disposable;
    private boolean dnsResolverEnabled;
    private String domainId;
    private boolean enableLossRttBadConnectionHandling;
    private final yf1 experiments;
    private IdsMapper<bg1, ParticipantId> externalIdsMapper;
    private boolean fastRecoverEnabled;
    private boolean forceRelayPolicy;
    private r38 groupCallMediaAdaptationConfig;
    private boolean hotStart;
    private final IdMappingWrapper idMappingWrapper;
    private IdsMapper<ParticipantId, bg1> internalIdsMapper;
    private boolean isAsrOnlineEnabled;
    private boolean isAudienceModeEnabled;
    private boolean isConsumerUpdateEnabled;
    private boolean isDeviceAudioShareEnabled;
    private boolean isFastScreenCaptureEnabled;
    private boolean isMediaAdaptationFeatureEnabledForGroupCall;
    private boolean isMediaAdaptationFeatureEnabledForP2PCall;
    private boolean isSessionRoomsFeatureEnabled;
    private boolean isSignalingDefaultValuesFilteringEnabled;
    private boolean isWaitingRoomActivated;
    private boolean isWebRTCCodecFilteringEnabled;
    private Locale locale;
    private a4c log;
    private b4c logConfiguration;
    private MediaConnectionSettings mediaConnectionSettings;
    private long mediaReceivingTimeoutMs;
    private boolean multipleDevicesEnabled;
    private OkApiService okApiService;
    private boolean onDemandTracksEnabled;
    private r38 p2pCallMediaAdaptationConfig;
    private final StatisticsManager<ProductStatItem> prodStat;
    private dnc rotationProvider;
    private RttRateHintConfig rttRateHintConfig;
    private yuc screenCapturePermissionProvider;
    private boolean serverTopologySuspendBelowMinBitrate;
    private boolean sessionIdEnabled;
    private boolean showLocalVideoInOriginalQuality;
    private final xye tracerLiteFacade;
    private String[] videoCodecs;
    private int videoTracksCount;

    public ConversationFactory(q2a q2aVar, Context context, String str) {
        this(q2aVar, context, str, null);
    }

    public static String generateConversationId() {
        return UUID.randomUUID().toString();
    }

    private ConversationBuilder getBaseBuilder() {
        ConversationBuilder stat = new ConversationBuilder(this.idMappingWrapper).setCreator(this).setContext(this.context).setApi(this.api).setExecutorService(WEBRTC_EXECUTOR).setVersion(this.appVersion).setStat(this.defaultStat);
        a4c fzeVar = this.log;
        if (!(fzeVar instanceof fze)) {
            fzeVar = new fze(this.tracerLiteFacade, fzeVar);
        }
        return stat.setLog(fzeVar).setLogConfiguration(this.logConfiguration).setClientType(this.clientType).setHotStart(this.hotStart).setForceRelayPolicy(this.forceRelayPolicy).setAudioLevelFrequencyMs(this.audioLevelFrequencyMs).setDomainId(this.domainId).setConsumerUpdateEnabled(this.isConsumerUpdateEnabled).setOnDemandTracksEnabled(this.onDemandTracksEnabled).setAdditionalWhitelistedCodecPrefixes(this.additionalWhitelistedCodecPrefixes).setBitrates(this.bitrates).setEnableLossRttBadConnectionHandling(this.enableLossRttBadConnectionHandling).setDataChannelScreenshareRecvEnabled(this.dataChannelScreenshareRecvEnabled).setDataChannelScreenshareSendEnabled(this.dataChannelScreenshareSendEnabled).setVideoTracksCount(this.videoTracksCount).setFastRecoverEnabled(this.fastRecoverEnabled).setSessionIdEnabled(this.sessionIdEnabled).setMediaReceivingTimeoutMs(this.mediaReceivingTimeoutMs).setIsWaitingRoomActivated(this.isWaitingRoomActivated).setSignalingDefaultValuesFilteringEnabled(this.isSignalingDefaultValuesFilteringEnabled).setWebRTCCodecFilteringEnabled(this.isWebRTCCodecFilteringEnabled).setWebRTCAudioCodecs(this.audioCodecs).setWebRTCVideoCodecs(this.videoCodecs).setMultipleDevicesEnabled(this.multipleDevicesEnabled).setRotationProvider(this.rotationProvider).setAnimojiDataSupplier(this.animojiDataSupplier).setRotationProvider(this.rotationProvider).showLocalVideoInOriginalQuality(this.showLocalVideoInOriginalQuality).setSessionRoomsEnabled(this.isSessionRoomsFeatureEnabled).setLocale(this.locale).setInternalIdsMapper(this.internalIdsMapper).setExternalIdsMapper(this.externalIdsMapper).setMediaAdaptationFeatureEnabledForP2PCall(this.isMediaAdaptationFeatureEnabledForP2PCall).setP2PCallMediaAdaptationConfig(this.p2pCallMediaAdaptationConfig).setMediaAdaptationFeatureEnabledForGroupCall(this.isMediaAdaptationFeatureEnabledForGroupCall).setGroupCallMediaAdaptationConfig(this.groupCallMediaAdaptationConfig).setAsrOnlineEnabled(this.isAsrOnlineEnabled).setExperiments(this.experiments).setAudienceModelEnabled(this.isAudienceModeEnabled).setServerTopologySuspendBelowMinBitrate(this.serverTopologySuspendBelowMinBitrate).setFastScreenCaptureEnabled(this.isFastScreenCaptureEnabled).setDeviceAudioShareEnabled(this.isDeviceAudioShareEnabled).setChatStateListener(this.chatStateListener).setOkApiService(this.okApiService).setDnsResolverEnabled(this.dnsResolverEnabled).setBadNetworkIndicatorConfig(this.badNetworkIndicatorConfig).setAnalyticsSender(this.callAnalyticsSender).setScreenCapturePermissionProvider(this.screenCapturePermissionProvider).setMediaConnectionSettings(this.mediaConnectionSettings).setRttRateHintConfig(this.rttRateHintConfig);
    }

    public static synchronized void init(Context context) {
        init(new ConversationFactoryInitParams.Builder(context).build());
    }

    private static /* synthetic */ nl lambda$answer$5(nl nlVar) {
        return new InMemorySessionStore();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$answer$6(AnswerCallParams answerCallParams, Conversation conversation) {
        answerCallParams.getOnPrepared().invoke(conversation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$answer$7(AnswerCallParams answerCallParams, Throwable th) {
        answerCallParams.getOnError().invoke(th);
    }

    private static /* synthetic */ nl lambda$call$2(nl nlVar) {
        return new InMemorySessionStore();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$call$3(StartCallParams startCallParams, Conversation conversation) {
        startCallParams.getOnPrepared().invoke(conversation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$call$4(StartCallParams startCallParams, Throwable th) {
        startCallParams.getOnError().invoke(th);
    }

    private static /* synthetic */ nl lambda$createConfRoom$18(nl nlVar) {
        return new InMemorySessionStore();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$createConfRoom$19(CreateConfParams createConfParams, Conversation conversation) {
        createConfParams.getOnPrepared().invoke(conversation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$createConfRoom$20(CreateConfParams createConfParams, Throwable th) {
        createConfParams.getOnError().invoke(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$hangup$21(db7 db7Var) throws JsonParseException, IOException {
        db7Var.z();
        return new Object();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$hangup$22(Object obj) throws Throwable {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$hangup$23(Throwable th) throws Throwable {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$join$8(JoinCallParams joinCallParams, Conversation conversation) {
        joinCallParams.getOnPrepared().invoke(conversation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$join$9(JoinCallParams joinCallParams, Throwable th) {
        joinCallParams.getOnError().invoke(th);
    }

    private static /* synthetic */ nl lambda$joinAnonByLink$13(nl nlVar) {
        return new InMemorySessionStore();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ql lambda$joinAnonByLink$14(JoinAnonByLinkParams joinAnonByLinkParams) throws IOException {
        return new ql(null, joinAnonByLinkParams.getApiEndpoint());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$joinAnonByLink$15() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$joinAnonByLink$16(JoinAnonByLinkParams joinAnonByLinkParams, Conversation conversation) {
        joinAnonByLinkParams.getOnPrepared().invoke(conversation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$joinAnonByLink$17(JoinAnonByLinkParams joinAnonByLinkParams, Throwable th) {
        joinAnonByLinkParams.getOnError().invoke(th);
    }

    private static /* synthetic */ nl lambda$joinByLink$10(nl nlVar) {
        return new InMemorySessionStore();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$joinByLink$11(JoinByLinkParams joinByLinkParams, Conversation conversation) {
        joinByLinkParams.getOnPrepared().invoke(conversation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$joinByLink$12(JoinByLinkParams joinByLinkParams, Throwable th) {
        joinByLinkParams.getOnError().invoke(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ a4c lambda$new$0() {
        return this.log;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ a4c lambda$new$1() {
        return this.log;
    }

    public Conversation answer(m56 m56Var) {
        final AnswerCallParams answerCallParams = (AnswerCallParams) m56Var.invoke(new AnswerCallParams.Builder());
        ConversationParams conversationParamsDecode = null;
        ConversationBuilder cameraCapturerFactory = getBaseBuilder().setHasVideo(answerCallParams.getShouldStartWithVideo()).setAnswerAsContact(answerCallParams.getAnswerAsContact()).setIsCaller(false).setIsAnswer(true).setPayload(null).setCid(answerCallParams.getConversationId()).setEventListener(answerCallParams.getEventListener()).setCameraCapturerFactory(answerCallParams.getCameraCapturerFactory());
        answerCallParams.getFrameInterceptor();
        ConversationBuilder opponentId = cameraCapturerFactory.setFrameInterceptor(null).setMyId(answerCallParams.getMyId()).setOpponentId(answerCallParams.getOpponentId());
        if (answerCallParams.getTokenProvider() != null) {
            fc3 fc3VarD = this.api.d();
            fc3VarD.a = new SimpleConfigurationStore((se3) fc3VarD.a);
            fc3VarD.b = answerCallParams.getTokenProvider();
            opponentId.setApi(fc3VarD.g());
        }
        if (answerCallParams.getTokenInfoProvider() != null) {
            fc3 fc3VarD2 = this.api.d();
            fc3VarD2.Z = lambda$answer$5((nl) fc3VarD2.Z);
            fc3VarD2.Y = answerCallParams.getTokenInfoProvider();
            opponentId.setApi(fc3VarD2.g());
        }
        ConversationImpl conversationImplCreateConversation = opponentId.createConversation();
        try {
            this.log.log(LOG_TAG, "Try to decode provided conversation params");
            conversationParamsDecode = ConversationParams.decode(answerCallParams.getConversationParams());
        } catch (Throwable unused) {
            this.log.log(LOG_TAG, "Error while trying to decode provided conversation params");
        }
        final int i = 0;
        final int i2 = 1;
        conversationImplCreateConversation.prepare(conversationParamsDecode, new rj3() { // from class: bw3
            @Override // defpackage.rj3
            public final void accept(Object obj) {
                int i3 = i;
                AnswerCallParams answerCallParams2 = answerCallParams;
                switch (i3) {
                    case 0:
                        ConversationFactory.lambda$answer$6(answerCallParams2, (Conversation) obj);
                        break;
                    default:
                        ConversationFactory.lambda$answer$7(answerCallParams2, (Throwable) obj);
                        break;
                }
            }
        }, new rj3() { // from class: bw3
            @Override // defpackage.rj3
            public final void accept(Object obj) {
                int i3 = i2;
                AnswerCallParams answerCallParams2 = answerCallParams;
                switch (i3) {
                    case 0:
                        ConversationFactory.lambda$answer$6(answerCallParams2, (Conversation) obj);
                        break;
                    default:
                        ConversationFactory.lambda$answer$7(answerCallParams2, (Throwable) obj);
                        break;
                }
            }
        });
        return conversationImplCreateConversation;
    }

    public Conversation call(m56 m56Var) {
        final StartCallParams startCallParams = (StartCallParams) m56Var.invoke(new StartCallParams.Builder());
        ConversationBuilder eventListener = getBaseBuilder().setHasVideo(startCallParams.getShouldStartWithVideo()).setIsCaller(true).setPayload(startCallParams.getPayload()).setCid(generateConversationId()).setEventListener(startCallParams.getEventListener());
        startCallParams.getFrameInterceptor();
        ConversationBuilder chatId = eventListener.setFrameInterceptor(null).setWatchTogetherEnabledForAll(startCallParams.getIsWatchTogetherEnabledForAll()).setCameraCapturerFactory(startCallParams.getCameraCapturerFactory()).setMyId(startCallParams.getMyId()).setOpponentId(startCallParams.getOpponentId()).setChatId(startCallParams.getChatId());
        if (startCallParams.getTokenProvider() != null) {
            fc3 fc3VarD = this.api.d();
            fc3VarD.a = new SimpleConfigurationStore((se3) fc3VarD.a);
            fc3VarD.b = startCallParams.getTokenProvider();
            chatId.setApi(fc3VarD.g());
        }
        if (startCallParams.getTokenInfoProvider() != null) {
            fc3 fc3VarD2 = this.api.d();
            fc3VarD2.Z = lambda$call$2((nl) fc3VarD2.Z);
            fc3VarD2.Y = startCallParams.getTokenInfoProvider();
            chatId.setApi(fc3VarD2.g());
        }
        ConversationImpl conversationImplCreateConversation = chatId.createConversation();
        final int i = 0;
        final int i2 = 1;
        conversationImplCreateConversation.prepare(null, new rj3() { // from class: wv3
            @Override // defpackage.rj3
            public final void accept(Object obj) {
                int i3 = i;
                StartCallParams startCallParams2 = startCallParams;
                switch (i3) {
                    case 0:
                        ConversationFactory.lambda$call$3(startCallParams2, (Conversation) obj);
                        break;
                    default:
                        ConversationFactory.lambda$call$4(startCallParams2, (Throwable) obj);
                        break;
                }
            }
        }, new rj3() { // from class: wv3
            @Override // defpackage.rj3
            public final void accept(Object obj) {
                int i3 = i2;
                StartCallParams startCallParams2 = startCallParams;
                switch (i3) {
                    case 0:
                        ConversationFactory.lambda$call$3(startCallParams2, (Conversation) obj);
                        break;
                    default:
                        ConversationFactory.lambda$call$4(startCallParams2, (Throwable) obj);
                        break;
                }
            }
        });
        return conversationImplCreateConversation;
    }

    public void clearApiAuthSession() {
        this.api.b().b();
    }

    public Conversation createConfRoom(m56 m56Var) {
        final CreateConfParams createConfParams = (CreateConfParams) m56Var.invoke(new CreateConfParams.Builder());
        ConversationBuilder eventListener = getBaseBuilder().setHasVideo(createConfParams.getShouldStartWithVideo()).setIsCaller(true).setPayload(createConfParams.getPayload()).setCid(generateConversationId()).setEventListener(createConfParams.getEventListener());
        createConfParams.getFrameInterceptor();
        ConversationBuilder myId = eventListener.setFrameInterceptor(null).setCameraCapturerFactory(createConfParams.getCameraCapturerFactory()).setWatchTogetherEnabledForAll(createConfParams.getIsWatchTogetherEnabledForAll()).setMyId(createConfParams.getMyId());
        if (createConfParams.getTokenProvider() != null) {
            fc3 fc3VarD = this.api.d();
            fc3VarD.b = createConfParams.getTokenProvider();
            fc3VarD.a = new SimpleConfigurationStore((se3) fc3VarD.a);
            myId.setApi(fc3VarD.g());
        }
        if (createConfParams.getTokenInfoProvider() != null) {
            fc3 fc3VarD2 = this.api.d();
            fc3VarD2.Z = lambda$createConfRoom$18((nl) fc3VarD2.Z);
            fc3VarD2.Y = createConfParams.getTokenInfoProvider();
            myId.setApi(fc3VarD2.g());
        }
        ConversationImpl conversationImplCreateConversation = myId.createConversation();
        conversationImplCreateConversation.initStore(createConfParams.getInitialIds());
        boolean zIsAnonForbidden = createConfParams.getIsAnonForbidden();
        final int i = 0;
        rj3 rj3Var = new rj3() { // from class: ew3
            @Override // defpackage.rj3
            public final void accept(Object obj) {
                int i2 = i;
                CreateConfParams createConfParams2 = createConfParams;
                switch (i2) {
                    case 0:
                        ConversationFactory.lambda$createConfRoom$19(createConfParams2, (Conversation) obj);
                        break;
                    default:
                        ConversationFactory.lambda$createConfRoom$20(createConfParams2, (Throwable) obj);
                        break;
                }
            }
        };
        final int i2 = 1;
        conversationImplCreateConversation.prepare(null, true, zIsAnonForbidden, rj3Var, new rj3() { // from class: ew3
            @Override // defpackage.rj3
            public final void accept(Object obj) {
                int i22 = i2;
                CreateConfParams createConfParams2 = createConfParams;
                switch (i22) {
                    case 0:
                        ConversationFactory.lambda$createConfRoom$19(createConfParams2, (Conversation) obj);
                        break;
                    default:
                        ConversationFactory.lambda$createConfRoom$20(createConfParams2, (Throwable) obj);
                        break;
                }
            }
        });
        return conversationImplCreateConversation;
    }

    public ConversationAnalyticsSender getAnalyticsSender() {
        return this.conversationAnalyticsSender;
    }

    public bi getAnimojiDataSupplier() {
        return this.animojiDataSupplier;
    }

    public int getAudioLevelFrequencyMs() {
        return this.audioLevelFrequencyMs;
    }

    public StatisticsManager<ProductStatItem> getProductStatisticsManager() {
        return this.prodStat;
    }

    public void hangup(ji6 ji6Var, String str, String str2) {
        rk0 rk0VarS = tu0.s("vchat.hangupConversation");
        rk0VarS.b = kl.c;
        rk0VarS.b(ApiProtocol.PARAM_CONVERSATION_ID, str);
        rk0VarS.b("reason", ji6Var.toString());
        rk0VarS.b(ApiProtocol.PARAM_ANONYM_TOKEN, str2);
        sk0 sk0VarA = rk0VarS.a(od2.b);
        qpc qpcVarC = this.api.c();
        yv3 yv3Var = new yv3(0);
        qpcVarC.getClass();
        iqd iqdVarRetryApiCallForBackgroundWork = RetryKt.retryApiCallForBackgroundWork(qpcVarC.a(new glc(sk0VarA, yv3Var)), this.experiments.h, this.log);
        yv3 yv3Var2 = new yv3(1);
        yv3 yv3Var3 = new yv3(2);
        iqdVarRetryApiCallForBackgroundWork.getClass();
        iq1 iq1Var = new iq1(yv3Var2, 2, yv3Var3);
        iqdVarRetryApiCallForBackgroundWork.k(iq1Var);
        this.disposable.a(iq1Var);
    }

    public boolean isDnsResolverEnabled() {
        return this.dnsResolverEnabled;
    }

    public Conversation join(m56 m56Var) {
        final JoinCallParams joinCallParams = (JoinCallParams) m56Var.invoke(new JoinCallParams.Builder());
        ConversationBuilder eventListener = getBaseBuilder().setHasVideo(joinCallParams.getShouldStartWithVideo()).setIsCaller(false).setIsJoined(true).setPayload(null).setCid(joinCallParams.getConversationId()).setEventListener(joinCallParams.getEventListener());
        joinCallParams.getFrameInterceptor();
        ConversationImpl conversationImplCreateConversation = eventListener.setFrameInterceptor(null).setChatId(joinCallParams.getChatId()).setCameraCapturerFactory(joinCallParams.getCameraCapturerFactory()).setMyId(joinCallParams.getMyId()).createConversation();
        conversationImplCreateConversation.initAsConfJoin();
        final int i = 0;
        final int i2 = 1;
        conversationImplCreateConversation.prepare(null, new rj3() { // from class: aw3
            @Override // defpackage.rj3
            public final void accept(Object obj) {
                int i3 = i;
                JoinCallParams joinCallParams2 = joinCallParams;
                switch (i3) {
                    case 0:
                        ConversationFactory.lambda$join$8(joinCallParams2, (Conversation) obj);
                        break;
                    default:
                        ConversationFactory.lambda$join$9(joinCallParams2, (Throwable) obj);
                        break;
                }
            }
        }, new rj3() { // from class: aw3
            @Override // defpackage.rj3
            public final void accept(Object obj) {
                int i3 = i2;
                JoinCallParams joinCallParams2 = joinCallParams;
                switch (i3) {
                    case 0:
                        ConversationFactory.lambda$join$8(joinCallParams2, (Conversation) obj);
                        break;
                    default:
                        ConversationFactory.lambda$join$9(joinCallParams2, (Throwable) obj);
                        break;
                }
            }
        });
        return conversationImplCreateConversation;
    }

    public Conversation joinAnonByLink(m56 m56Var) {
        final JoinAnonByLinkParams joinAnonByLinkParams = (JoinAnonByLinkParams) m56Var.invoke(new JoinAnonByLinkParams.Builder());
        fc3 fc3VarD = this.api.d();
        if (((rl) fc3VarD.Y) == null || joinAnonByLinkParams.getApiEndpoint() == null) {
            fc3VarD.a = new SimpleConfigurationStore((se3) fc3VarD.a);
            fc3VarD.b = new yv3(3);
        } else {
            fc3VarD.Z = lambda$joinAnonByLink$13((nl) fc3VarD.Z);
            fc3VarD.Y = new v02(27, joinAnonByLinkParams);
        }
        ConversationBuilder eventListener = getBaseBuilder().setHasVideo(joinAnonByLinkParams.getShouldStartWithVideo()).setIsCaller(false).setIsJoined(true).setPayload(null).setEventListener(joinAnonByLinkParams.getEventListener());
        joinAnonByLinkParams.getFrameInterceptor();
        ConversationImpl conversationImplCreateConversation = eventListener.setFrameInterceptor(null).setJoinLink(joinAnonByLinkParams.getLink()).setApi(fc3VarD.g()).setCameraCapturerFactory(joinAnonByLinkParams.getCameraCapturerFactory()).setMyId(joinAnonByLinkParams.getMyId()).createConversation();
        conversationImplCreateConversation.initAsConfJoin();
        final int i = 0;
        final int i2 = 1;
        conversationImplCreateConversation.prepareJoinByLink(new rj3() { // from class: xv3
            @Override // defpackage.rj3
            public final void accept(Object obj) {
                int i3 = i;
                JoinAnonByLinkParams joinAnonByLinkParams2 = joinAnonByLinkParams;
                switch (i3) {
                    case 0:
                        ConversationFactory.lambda$joinAnonByLink$16(joinAnonByLinkParams2, (Conversation) obj);
                        break;
                    default:
                        ConversationFactory.lambda$joinAnonByLink$17(joinAnonByLinkParams2, (Throwable) obj);
                        break;
                }
            }
        }, new rj3() { // from class: xv3
            @Override // defpackage.rj3
            public final void accept(Object obj) {
                int i3 = i2;
                JoinAnonByLinkParams joinAnonByLinkParams2 = joinAnonByLinkParams;
                switch (i3) {
                    case 0:
                        ConversationFactory.lambda$joinAnonByLink$16(joinAnonByLinkParams2, (Conversation) obj);
                        break;
                    default:
                        ConversationFactory.lambda$joinAnonByLink$17(joinAnonByLinkParams2, (Throwable) obj);
                        break;
                }
            }
        }, joinAnonByLinkParams.getToken());
        return conversationImplCreateConversation;
    }

    public Conversation joinByLink(m56 m56Var) {
        final JoinByLinkParams joinByLinkParams = (JoinByLinkParams) m56Var.invoke(new JoinByLinkParams.Builder());
        ConversationBuilder eventListener = getBaseBuilder().setHasVideo(joinByLinkParams.getShouldStartWithVideo()).setIsCaller(false).setIsJoined(true).setPayload(null).setEventListener(joinByLinkParams.getEventListener());
        joinByLinkParams.getFrameInterceptor();
        ConversationBuilder myId = eventListener.setFrameInterceptor(null).setJoinLink(joinByLinkParams.getLink()).setCameraCapturerFactory(joinByLinkParams.getCameraCapturerFactory()).setPayload(joinByLinkParams.getPayload()).setMyId(joinByLinkParams.getMyId());
        if (joinByLinkParams.getTokenProvider() != null) {
            fc3 fc3VarD = this.api.d();
            fc3VarD.b = joinByLinkParams.getTokenProvider();
            fc3VarD.a = new SimpleConfigurationStore((se3) fc3VarD.a);
            myId.setApi(fc3VarD.g());
        }
        if (joinByLinkParams.getTokenInfoProvider() != null) {
            fc3 fc3VarD2 = this.api.d();
            fc3VarD2.Z = lambda$joinByLink$10((nl) fc3VarD2.Z);
            fc3VarD2.Y = joinByLinkParams.getTokenInfoProvider();
            myId.setApi(fc3VarD2.g());
        }
        ConversationImpl conversationImplCreateConversation = myId.createConversation();
        conversationImplCreateConversation.initAsConfJoin();
        final int i = 0;
        final int i2 = 1;
        conversationImplCreateConversation.prepareJoinByLink(new rj3() { // from class: zv3
            @Override // defpackage.rj3
            public final void accept(Object obj) {
                int i3 = i;
                JoinByLinkParams joinByLinkParams2 = joinByLinkParams;
                switch (i3) {
                    case 0:
                        ConversationFactory.lambda$joinByLink$11(joinByLinkParams2, (Conversation) obj);
                        break;
                    default:
                        ConversationFactory.lambda$joinByLink$12(joinByLinkParams2, (Throwable) obj);
                        break;
                }
            }
        }, new rj3() { // from class: zv3
            @Override // defpackage.rj3
            public final void accept(Object obj) {
                int i3 = i2;
                JoinByLinkParams joinByLinkParams2 = joinByLinkParams;
                switch (i3) {
                    case 0:
                        ConversationFactory.lambda$joinByLink$11(joinByLinkParams2, (Conversation) obj);
                        break;
                    default:
                        ConversationFactory.lambda$joinByLink$12(joinByLinkParams2, (Throwable) obj);
                        break;
                }
            }
        }, null);
        return conversationImplCreateConversation;
    }

    public void reset() {
        this.disposable.d();
        this.api.b().b();
        this.idMappingWrapper.clear();
    }

    public void setAdditionalWhitelistedCodecPrefixes(List<String> list) {
        this.additionalWhitelistedCodecPrefixes = list;
    }

    public void setAnimojiDataSupplier(bi biVar) {
        this.animojiDataSupplier = biVar;
    }

    public void setApiRetriesEnabled(boolean z) {
        this.experiments.h = z;
    }

    public void setAppVersion(String str) {
        this.appVersion = str;
    }

    public void setAsrOnlineEnabled(boolean z) {
        this.isAsrOnlineEnabled = z;
    }

    public void setAudienceModeEnabled(boolean z) {
        this.isAudienceModeEnabled = z;
    }

    public void setAudioCodecs(String[] strArr) {
        this.audioCodecs = strArr;
    }

    public void setAudioLevelFrequencyMs(int i) {
        this.audioLevelFrequencyMs = i;
    }

    public void setBadNetworkIndicatorConfig(uf0 uf0Var) {
        this.badNetworkIndicatorConfig = uf0Var;
    }

    @Deprecated(forRemoval = EnhancedAnimatedVectorDrawable.SHOULD_IGNORE_INVALID_ANIMATION, since = "125.1.0.24")
    public void setBitrateByTableCalculationEnabled(boolean z) {
    }

    public void setBitrates(xf1 xf1Var) {
        this.bitrates = xf1Var;
    }

    public void setCamera2ApiEnabled(boolean z) {
        this.experiments.a = z;
    }

    @Deprecated(since = "112.1.6.15")
    public void setCameraFrameMaxDimension(int i) {
        this.experiments.e = Integer.valueOf(i);
    }

    public void setChatStateListener(ChatStateListener chatStateListener) {
        this.chatStateListener = chatStateListener;
    }

    public void setConsumerUpdateEnabled(boolean z) {
        this.isConsumerUpdateEnabled = z;
    }

    public void setDataChannelScreenshareRecvEnabled(boolean z) {
        this.dataChannelScreenshareRecvEnabled = z;
    }

    public void setDataChannelScreenshareSendEnabled(boolean z) {
        this.dataChannelScreenshareSendEnabled = z;
    }

    public void setDeviceAudioShareEnabled(boolean z) {
        this.isDeviceAudioShareEnabled = z;
    }

    public void setDomainId(String str) {
        this.domainId = str;
    }

    public void setDtxDisabled(boolean z) {
        this.experiments.g = z;
    }

    public void setDynamicScreenShareSizeUpdateEnabled(boolean z) {
        this.experiments.k = z;
    }

    public void setEnableLossRttBadConnectionHandling(boolean z) {
        this.enableLossRttBadConnectionHandling = z;
    }

    public void setEnabledDnsResolver(boolean z) {
        this.dnsResolverEnabled = z;
    }

    public void setEnqueuedCommandMergeEnabled(boolean z) {
        this.experiments.i = z;
    }

    @Deprecated
    public void setExceptionConsumer(y3c y3cVar) {
    }

    public void setExternalIdsMapper(IdsMapper<bg1, ParticipantId> idsMapper) {
        this.externalIdsMapper = idsMapper;
    }

    public void setFastRecoverEnabled(boolean z) {
        this.fastRecoverEnabled = z;
    }

    public void setFastScreenCaptureEnabled(boolean z) {
        this.isFastScreenCaptureEnabled = z;
    }

    public void setForceRelayPolicy(boolean z) {
        this.forceRelayPolicy = z;
    }

    public void setGroupCallMediaAdaptationConfig(r38 r38Var) {
        this.groupCallMediaAdaptationConfig = r38Var;
    }

    public void setHotStart(boolean z) {
        this.hotStart = z;
    }

    public void setInternalIdsMapper(IdsMapper<ParticipantId, bg1> idsMapper) {
        this.internalIdsMapper = idsMapper;
    }

    public void setIsMediaAdaptationFeatureEnabledForGroupCall(boolean z) {
        this.isMediaAdaptationFeatureEnabledForGroupCall = z;
    }

    public void setIsMediaAdaptationFeatureEnabledForP2PCall(boolean z) {
        this.isMediaAdaptationFeatureEnabledForP2PCall = z;
    }

    public void setIsWaitingRoomActivated(boolean z) {
        this.isWaitingRoomActivated = z;
    }

    public void setLocale(Locale locale) {
        this.locale = locale;
    }

    public void setLogConfiguration(b4c b4cVar) {
        this.logConfiguration = b4cVar;
    }

    public void setLogger(a4c a4cVar) {
        if (a4cVar == null) {
            a4cVar = z3c.a;
            this.api.b().f(hl.a);
        } else {
            this.api.b().f(new LoggingApiRequestDebugger(a4cVar));
        }
        fze fzeVar = new fze(this.tracerLiteFacade, a4cVar);
        this.log = fzeVar;
        GlobalRTCLogger.setLog(fzeVar);
    }

    public void setMediaConnectionSettings(MediaConnectionSettings mediaConnectionSettings) {
        this.mediaConnectionSettings = mediaConnectionSettings;
    }

    public void setMediaReceivingTimeoutMs(long j) {
        this.mediaReceivingTimeoutMs = j;
    }

    public void setMultipleDevicesEnabled(boolean z) {
        this.multipleDevicesEnabled = z;
    }

    public void setOkApiService(OkApiService okApiService) {
        this.okApiService = okApiService;
    }

    public void setOnDemandTracksEnabled(boolean z) {
        this.onDemandTracksEnabled = z;
    }

    public void setP2PCallMediaAdaptationConfig(r38 r38Var) {
        this.p2pCallMediaAdaptationConfig = r38Var;
    }

    public void setRotationProvider(dnc dncVar) {
        this.rotationProvider = dncVar;
    }

    public void setRttRateHintConfig(RttRateHintConfig rttRateHintConfig) {
        this.rttRateHintConfig = rttRateHintConfig;
    }

    public void setScreenCapturePermissionProvider(yuc yucVar) {
        this.screenCapturePermissionProvider = yucVar;
    }

    public void setServerTopologySuspendBelowMinBitrate(boolean z) {
        this.serverTopologySuspendBelowMinBitrate = z;
    }

    public void setSessionIdEnabled(boolean z) {
        this.sessionIdEnabled = z;
    }

    public void setSessionRoomsEnabled(boolean z) {
        this.isSessionRoomsFeatureEnabled = z;
    }

    public void setShowLocalVideoInOriginalQuality(boolean z) {
        this.showLocalVideoInOriginalQuality = z;
    }

    public void setSignalingDefaultValuesFilteringEnabled(boolean z) {
        this.isSignalingDefaultValuesFilteringEnabled = z;
    }

    public void setStartCallByExternalIdEnabled(boolean z) {
        this.experiments.j = z;
    }

    public void setTimeouts(zf1 zf1Var) {
        this.experiments.f = zf1Var;
    }

    public void setVideoCodecs(String[] strArr) {
        this.videoCodecs = strArr;
    }

    public void setVideoDegradationForSoftwareCodec(boolean z, Float f, Float f2) {
        yf1 yf1Var = this.experiments;
        yf1Var.b = z;
        if (z && f2 != null) {
            yf1Var.c = f.floatValue();
        }
        if (!z || f2 == null) {
            return;
        }
        this.experiments.d = f2.floatValue();
    }

    @Deprecated(forRemoval = EnhancedAnimatedVectorDrawable.SHOULD_IGNORE_INVALID_ANIMATION, since = "125.1.0.24")
    public void setVideoQualityUpdateNotificationEnabled(boolean z) {
    }

    public void setVideoTracksCount(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("Video tracks count must be positive");
        }
        this.videoTracksCount = i;
    }

    public void setWebRTCCodecFilteringEnabled(boolean z) {
        this.isWebRTCCodecFilteringEnabled = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @SuppressLint({"NewApi"})
    public ConversationFactory(q2a q2aVar, Context context, String str, String str2) {
        Clock clockSystemUTC = Clock.systemUTC();
        Objects.requireNonNull(clockSystemUTC);
        this(q2aVar, context, str, str2, new dw3(clockSystemUTC, 1));
    }

    public static synchronized void init(Context context, NativeLibraryLoader nativeLibraryLoader) {
        init(new ConversationFactoryInitParams.Builder(context).setPeerConnection(new ConversationFactoryInitParams.PeerConnection.Builder().setNativeLibraryLoader(nativeLibraryLoader).build()).build());
    }

    public ConversationFactory(q2a q2aVar, Context context, String str, String str2, ExtLogger.TimeProvider timeProvider) {
        this.isWaitingRoomActivated = true;
        this.enableLossRttBadConnectionHandling = false;
        this.hotStart = false;
        this.log = z3c.a;
        this.logConfiguration = CallUtil.LOG_CONFIGURATION;
        this.forceRelayPolicy = false;
        this.audioLevelFrequencyMs = 250;
        this.additionalWhitelistedCodecPrefixes = Arrays.asList("OMX.MTK", "OMX.hisi");
        this.isConsumerUpdateEnabled = true;
        this.onDemandTracksEnabled = true;
        this.dataChannelScreenshareRecvEnabled = true;
        this.dataChannelScreenshareSendEnabled = true;
        this.videoTracksCount = 10;
        this.fastRecoverEnabled = true;
        this.sessionIdEnabled = true;
        this.mediaReceivingTimeoutMs = WorkRequest.MIN_BACKOFF_MILLIS;
        this.isSignalingDefaultValuesFilteringEnabled = true;
        this.rotationProvider = dnc.U;
        this.appVersion = DEFAULT_APP_VERSION;
        this.isWebRTCCodecFilteringEnabled = false;
        this.audioCodecs = null;
        this.videoCodecs = null;
        this.multipleDevicesEnabled = false;
        this.showLocalVideoInOriginalQuality = false;
        this.isSessionRoomsFeatureEnabled = true;
        this.isFastScreenCaptureEnabled = false;
        this.isDeviceAudioShareEnabled = false;
        this.isAsrOnlineEnabled = false;
        this.experiments = new yf1();
        this.locale = null;
        this.animojiDataSupplier = b46.b;
        this.isMediaAdaptationFeatureEnabledForP2PCall = true;
        this.isMediaAdaptationFeatureEnabledForGroupCall = true;
        this.chatStateListener = ChatStateListener.EMPTY;
        this.serverTopologySuspendBelowMinBitrate = false;
        this.isAudienceModeEnabled = false;
        this.badNetworkIndicatorConfig = uf0.e;
        CallAnalyticsSender callAnalyticsSender = CallAnalyticsSender.INSTANCE;
        this.callAnalyticsSender = callAnalyticsSender;
        ConversationAnalyticsSenderImpl conversationAnalyticsSenderImpl = new ConversationAnalyticsSenderImpl();
        this.conversationAnalyticsSender = conversationAnalyticsSenderImpl;
        this.mediaConnectionSettings = new MediaConnectionSettings();
        this.rttRateHintConfig = new RttRateHintConfig();
        this.clientType = str;
        this.domainId = str2;
        this.api = q2aVar;
        this.context = context;
        this.disposable = new hc3();
        final int i = 0;
        IdMappingWrapper idMappingWrapper = IdMappingWrapper.get(context, new RTCLogWrapper(new k56(this) { // from class: cw3
            public final /* synthetic */ ConversationFactory b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                int i2 = i;
                ConversationFactory conversationFactory = this.b;
                switch (i2) {
                    case 0:
                        return conversationFactory.lambda$new$0();
                    default:
                        return conversationFactory.lambda$new$1();
                }
            }
        }));
        this.idMappingWrapper = idMappingWrapper;
        Clock clockSystemUTC = Clock.systemUTC();
        Objects.requireNonNull(clockSystemUTC);
        this.prodStat = new ProductStatisticsManagerImpl(new dw3(clockSystemUTC, 0));
        this.defaultStat = new ExtLogger(context.getApplicationInfo().packageName, timeProvider);
        idMappingWrapper.scheduleReadCacheFromDisk();
        this.additionalWhitelistedCodecPrefixes = Collections.emptyList();
        this.bitrates = CallUtil.createBitrates();
        this.okApiService = new OkApiService(q2aVar.c());
        this.tracerLiteFacade = new xye(context);
        final int i2 = 1;
        new CallAnalyticsInitializer().init(callAnalyticsSender, conversationAnalyticsSenderImpl.getConfiguration(), q2aVar, new k56(this) { // from class: cw3
            public final /* synthetic */ ConversationFactory b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                int i22 = i2;
                ConversationFactory conversationFactory = this.b;
                switch (i22) {
                    case 0:
                        return conversationFactory.lambda$new$0();
                    default:
                        return conversationFactory.lambda$new$1();
                }
            }
        });
    }

    public static synchronized void init(ConversationFactoryInitParams conversationFactoryInitParams) {
        psa psaVar;
        psa psaVar2;
        if (initDone) {
            return;
        }
        initDone = true;
        ConversationFactoryInitParams.PeerConnection peerConnection = conversationFactoryInitParams.getPeerConnection();
        ConversationFactoryInitParams.PeerConnection.DynamicRedundancyParameters dynamicRedundancyParams = peerConnection.getDynamicRedundancyParams();
        Context context = conversationFactoryInitParams.getContext();
        a4c logger = peerConnection.getLogger();
        Integer rttMultCapMs = peerConnection.getRttMultCapMs();
        boolean zIsREDEnabledP2P = peerConnection.getIsREDEnabledP2P();
        boolean zIsREDEnabledServer = peerConnection.getIsREDEnabledServer();
        boolean zIsOpusDREDEnabled = peerConnection.getIsOpusDREDEnabled();
        if (dynamicRedundancyParams == null) {
            psaVar = null;
        } else {
            psaVar = new psa(dynamicRedundancyParams.isEnabled(), dynamicRedundancyParams.getMinAudioBitrateBps(), dynamicRedundancyParams.getDREDSwitchBitrateBps(), dynamicRedundancyParams.isNoLACEEnabled(), dynamicRedundancyParams.isDREDWithFecEnabled(), dynamicRedundancyParams.isDREDLowBitrateEnabled(), dynamicRedundancyParams.getPTimeMinMs(), dynamicRedundancyParams.getPTimeMaxMs());
        }
        boolean zIsOpusDREDLowBitrateEnabled = peerConnection.getIsOpusDREDLowBitrateEnabled();
        String bonusFieldTrials = peerConnection.getBonusFieldTrials();
        String udpMarker = peerConnection.getUdpMarker();
        String tcpMarker = peerConnection.getTcpMarker();
        boolean zIsEarlyAudioPlayoutEnabled = peerConnection.getIsEarlyAudioPlayoutEnabled();
        boolean zIsEarlyAudioRecordingEnabled = peerConnection.getIsEarlyAudioRecordingEnabled();
        boolean zIsSkipRelayToNotRelayConnectionEnabled = peerConnection.getIsSkipRelayToNotRelayConnectionEnabled();
        boolean zIsSharedSocketDisabledForICE = peerConnection.getIsSharedSocketDisabledForICE();
        if (psaVar == null) {
            Boolean bool = Boolean.FALSE;
            psaVar2 = new psa(false, null, null, bool, bool, null, null, null);
        } else {
            psaVar2 = psaVar;
        }
        nsa.D(context, new h7b(new qsa(zIsREDEnabledP2P, zIsREDEnabledServer, udpMarker, tcpMarker, rttMultCapMs, zIsEarlyAudioPlayoutEnabled, zIsEarlyAudioRecordingEnabled, zIsSkipRelayToNotRelayConnectionEnabled, zIsOpusDREDEnabled, psaVar2, zIsOpusDREDLowBitrateEnabled, zIsSharedSocketDisabledForICE, bonusFieldTrials), logger, false, 28), conversationFactoryInitParams.getPeerConnection().getLibraryLoader());
    }

    public void hangup(ji6 ji6Var, String str) {
        hangup(ji6Var, str, null);
    }
}
