echo 'Create custom local image'
docker build --tag fitness-challenge-persistence -f Dockerfile .
echo 'Custom image created'

echo 'Tagging custom image'
docker tag fitness-challenge-persistence:latest costantino96/fitness-challenge-persistence:1.0.3-SNAPSHOT
echo 'Tagging done'

echo 'Push image to registry'
docker login --username costantino96 --password dckr_pat_m2gAVNu_QY7tOQATHpZxDgXkD6I
docker push costantino96/fitness-challenge-persistence:1.0.3-SNAPSHOT
echo 'Push DONE'

echo 'Apply the new image to kubernetes'
# shellcheck disable=SC2164
cd k8s
kubectl apply -f app-deployment.yaml