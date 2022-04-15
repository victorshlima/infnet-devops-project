#victation/infnet-gitlab:1.0.3
export VERSION=1.0.3
export TAG_NAME=$VERSION
export LOCAL_IMAGE=victation/infnet-gitlab
export NEW_REPO=victation/infnet-gitlab

echo TAG_NAME=$TAG_NAME LOCAL_IMAGE=$LOCAL_IMAGE NEW_REPO=$NEW_REPO VERSION=$VERSION
 # Open a new child shell

docker build -t $LOCAL_IMAGE:$VERSION .
#Successfully built 857815ea94f5
#Successfully tagged victation/infnet-gitlab:latest
#docker tag local-image:tagname new-repo:tagname
docker tag $LOCAL_IMAGE:$VERSION $NEW_REPO:#VERSION
#docker push new-repo:tagname
docker push $NEW_REPO:$VERSION