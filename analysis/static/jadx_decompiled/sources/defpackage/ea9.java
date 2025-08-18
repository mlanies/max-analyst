package defpackage;

import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final class ea9 extends da9 {
    public static final ea9 d = new ea9(11, 12, 0);
    public static final ea9 e = new ea9(12, 13, 1);
    public static final ea9 f = new ea9(15, 16, 2);
    public static final ea9 g = new ea9(1, 2, 3);
    public static final ea9 h = new ea9(3, 4, 4);
    public static final ea9 i = new ea9(4, 5, 5);
    public static final ea9 j = new ea9(6, 7, 6);
    public static final ea9 k = new ea9(7, 8, 7);
    public static final ea9 l = new ea9(8, 9, 8);
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ea9(int i2, int i3, int i4) {
        super(i2, i3);
        this.c = i4;
    }

    private final void b(k36 k36Var) {
    }

    private final void c(k36 k36Var) {
    }

    @Override // defpackage.da9
    public final void a(k36 k36Var) {
        switch (this.c) {
            case 0:
                k36Var.U("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
                return;
            case 1:
                k36Var.U("UPDATE workspec SET required_network_type = 0 WHERE required_network_type IS NULL ");
                k36Var.U("UPDATE workspec SET content_uri_triggers = x'' WHERE content_uri_triggers is NULL");
                return;
            case 2:
                ey8.l(k36Var, "DELETE FROM SystemIdInfo WHERE work_spec_id IN (SELECT work_spec_id FROM SystemIdInfo LEFT JOIN WorkSpec ON work_spec_id = id WHERE WorkSpec.id IS NULL)", "ALTER TABLE `WorkSpec` ADD COLUMN `generation` INTEGER NOT NULL DEFAULT 0", "CREATE TABLE IF NOT EXISTS `_new_SystemIdInfo` (\n            `work_spec_id` TEXT NOT NULL, \n            `generation` INTEGER NOT NULL DEFAULT 0, \n            `system_id` INTEGER NOT NULL, \n            PRIMARY KEY(`work_spec_id`, `generation`), \n            FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) \n                ON UPDATE CASCADE ON DELETE CASCADE )", "INSERT INTO `_new_SystemIdInfo` (`work_spec_id`,`system_id`) SELECT `work_spec_id`,`system_id` FROM `SystemIdInfo`");
                k36Var.U("DROP TABLE `SystemIdInfo`");
                k36Var.U("ALTER TABLE `_new_SystemIdInfo` RENAME TO `SystemIdInfo`");
                return;
            case 3:
                ey8.l(k36Var, "\n    CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id`\n    INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`)\n    REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )\n    ", "\n    INSERT INTO SystemIdInfo(work_spec_id, system_id)\n    SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo\n    ", "DROP TABLE IF EXISTS alarmInfo", "\n                INSERT OR IGNORE INTO worktag(tag, work_spec_id)\n                SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec\n                ");
                return;
            case 4:
                k36Var.U("\n    UPDATE workspec SET schedule_requested_at = 0\n    WHERE state NOT IN (2, 3, 5)\n        AND schedule_requested_at = -1\n        AND interval_duration <> 0\n    ");
                return;
            case 5:
                k36Var.U("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
                k36Var.U("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
                return;
            case 6:
                k36Var.U("\n    CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress`\n    BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`)\n    REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )\n    ");
                return;
            case 7:
                k36Var.U("\n    CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec`(`period_start_time`)\n    ");
                return;
            case 8:
                k36Var.U("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
                return;
            case 9:
                k36Var.m();
                try {
                    k36Var.U("CREATE TABLE IF NOT EXISTS profile (\n    id INTEGER PRIMARY KEY NOT NULL,\n    server_id INTEGER NOT NULL,\n    profile BLOB NOT NULL\n)");
                    k36Var.U("CREATE UNIQUE INDEX index_profile_server_id ON profile(server_id)");
                    k36Var.r0();
                } finally {
                    try {
                        return;
                    } finally {
                    }
                }
                return;
            case 10:
            case 11:
                return;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                k36Var.U("CREATE TABLE IF NOT EXISTS `animoji_set` (`id` INTEGER NOT NULL, `name` TEXT NOT NULL, `icon_url` TEXT NOT NULL, `icon_lottie_url` TEXT, `update_time` INTEGER NOT NULL, `animoji_ids` TEXT NOT NULL, PRIMARY KEY(`id`))");
                return;
            case 13:
                k36Var.U("CREATE TABLE IF NOT EXISTS `saved_msg_chat` (`user_id` INTEGER NOT NULL, `chat_id` INTEGER NOT NULL, PRIMARY KEY(`user_id`))");
                k36Var.U("CREATE UNIQUE INDEX IF NOT EXISTS `index_saved_msg_chat_chat_id` ON `saved_msg_chat` (`chat_id`)");
                return;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                k36Var.U("CREATE TABLE IF NOT EXISTS `webapp_biometry` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `user_id` INTEGER NOT NULL, `bot_id` INTEGER NOT NULL, `token` TEXT, `access_requested` INTEGER NOT NULL, `access_granted` INTEGER NOT NULL)");
                k36Var.U("CREATE INDEX IF NOT EXISTS `index_webapp_biometry_user_id` ON `webapp_biometry` (`user_id`)");
                k36Var.U("CREATE INDEX IF NOT EXISTS `index_webapp_biometry_bot_id` ON `webapp_biometry` (`bot_id`)");
                return;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                k36Var.U("ALTER TABLE `stickers` ADD COLUMN `video_url` TEXT DEFAULT NULL");
                return;
            case 16:
                k36Var.U("CREATE TABLE IF NOT EXISTS `animoji` (`id` INTEGER NOT NULL, `update_time` INTEGER NOT NULL, `emoji` TEXT NOT NULL, `lottie_url` TEXT, `lottie_play_url` TEXT, `set_id` INTEGER, PRIMARY KEY(`id`))");
                k36Var.U("CREATE TABLE IF NOT EXISTS `reactions_section` (`id` TEXT NOT NULL, `update_time` INTEGER NOT NULL, `reactions` TEXT NOT NULL, PRIMARY KEY(`id`))");
                return;
            case LangUtils.HASH_SEED /* 17 */:
                k36Var.U("ALTER TABLE `fcm_notifications` ADD COLUMN `event_key` TEXT DEFAULT NULL");
                k36Var.U("ALTER TABLE `fcm_notifications_analytics` ADD COLUMN `event_key` TEXT DEFAULT NULL");
                return;
            case 18:
                ey8.l(k36Var, "ALTER TABLE `chat_folder` ADD COLUMN `elements` BLOB DEFAULT NULL", "ALTER TABLE `chat_folder` ADD COLUMN `creatorId` INTEGER DEFAULT NULL", "ALTER TABLE `chat_folder` ADD COLUMN `filterSubjects` BLOB DEFAULT NULL", "ALTER TABLE `chat_folder` ADD COLUMN `widgets` BLOB DEFAULT NULL");
                k36Var.U("ALTER TABLE `chat_folder` ADD COLUMN `options` BLOB DEFAULT NULL");
                k36Var.U("ALTER TABLE `chat_folder` ADD COLUMN `isRemoved` INTEGER NOT NULL DEFAULT 0");
                k36Var.U("ALTER TABLE `animoji` ADD COLUMN `icon_url` TEXT DEFAULT NULL");
                return;
            case 19:
                k36Var.U("ALTER TABLE `events` ADD COLUMN `isCritical` INTEGER NOT NULL DEFAULT 0");
                return;
            default:
                ey8.l(k36Var, "CREATE TABLE IF NOT EXISTS `_new_WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))", "INSERT INTO `_new_WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) SELECT `id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers` FROM `WorkSpec`", "DROP TABLE `WorkSpec`", "ALTER TABLE `_new_WorkSpec` RENAME TO `WorkSpec`");
                k36Var.U("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
                k36Var.U("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `WorkSpec` (`period_start_time`)");
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ea9() {
        super(14, 15);
        this.c = 9;
    }
}
