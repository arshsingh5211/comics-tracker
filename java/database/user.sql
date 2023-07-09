-- ********************************************************************************
-- This script creates the database users and grants them the necessary permissions
-- ********************************************************************************

CREATE USER comics_tracker_owner
WITH PASSWORD 'comicstracker';

GRANT ALL
ON ALL TABLES IN SCHEMA public
TO comics_tracker_owner;

GRANT ALL
ON ALL SEQUENCES IN SCHEMA public
TO comics_tracker_owner;

CREATE USER final_capstone_appuser
WITH PASSWORD 'comicstracker';

GRANT SELECT, INSERT, UPDATE, DELETE
ON ALL TABLES IN SCHEMA public
TO comics_tracker_appuser;

GRANT USAGE, SELECT
ON ALL SEQUENCES IN SCHEMA public
TO comics_tracker_appuser;
